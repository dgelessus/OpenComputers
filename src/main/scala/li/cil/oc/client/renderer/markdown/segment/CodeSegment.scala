package li.cil.oc.client.renderer.markdown.segment

import li.cil.oc.client.renderer.TextBufferRenderCache
import net.minecraft.client.gui.FontRenderer
import org.lwjgl.opengl.GL11

private[markdown] class CodeSegment(val parent: Segment, val text: String) extends BasicTextSegment {
  override def render(x: Int, y: Int, indent: Int, maxWidth: Int, renderer: FontRenderer, mouseX: Int, mouseY: Int): Option[InteractiveSegment] = {
    TextBufferRenderCache.renderer.generateChars(text.toCharArray)

    var currentX = x + indent
    var currentY = y
    var chars = text
    val wrapIndent = computeWrapIndent(renderer)
    var numChars = maxChars(chars, maxWidth - indent, maxWidth - wrapIndent, renderer)
    while (chars.length > 0) {
      val part = chars.take(numChars)
      GL11.glColor4f(0.75f, 0.8f, 1, 1)
      TextBufferRenderCache.renderer.drawString(part, currentX, currentY)
      currentX = x + wrapIndent
      currentY += lineHeight(renderer)
      chars = chars.drop(numChars).dropWhile(_.isWhitespace)
      numChars = maxChars(chars, maxWidth - wrapIndent, maxWidth - wrapIndent, renderer)
    }

    None
  }

  override protected def ignoreLeadingWhitespace: Boolean = false

  override protected def stringWidth(s: String, renderer: FontRenderer): Int = s.length * TextBufferRenderCache.renderer.charRenderWidth

  override def toString: String = s"{CodeSegment: text = $text}"
}
