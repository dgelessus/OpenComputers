# Руководство OpenComputers

OpenComputers это мод, который добавляет модульные и настраиваемые [компьютеры](general/computer.md), [серверы](item/server1.md), [роботов](block/robot.md) и [дронов](item/drone.md) в игру, которые сохраняют свое состояние. Все устройства могут быть запрограммированы на языке Lua 5.2, что позволяет работать на системах любой сложности. 

Чтобы понять, как использовать руководство, прочитайте [эту страницу](item/manual.md) (этот зеленый текст - ссылка, кликните на него).

## Содержание

### Устройства
- [Компьютеры](general/computer.md)
- [Серверы](item/server1.md)
- [Микроконтроллеры](block/microcontroller.md)
- [Роботы](block/robot.md)
- [Дроны](item/drone.md)

### Программы и программирование
- [OpenOS](general/openOS.md)
- [Lua](general/lua.md)

### Блоки и предметы
- [Предметы](item/index.md)
- [Блоки](block/index.md)

### Обучение
- [С чего начать?](general/quickstart.md)

## Обзор

Как упоминалось выше, компьютеры в OpenComputers сохраняют свое состояние, это означает, что [компьютер](general/computer.md) сохраняет свое состояние, даже если чанк был отгружен. Это означает, что если игрок отошел от [компьютера](general/computer.md) или вышел, то [компьютер](general/computer.md) запомнит свое последнее состояние и продолжит работу, тогда, когда игрок снова окажется около [компьютера](general/computer.md). Так работают все блоки, за исключением [планшетов](item/tablet.md).  

Все устройства модульные и могут быть собраны с большим количеством различных компонентов, также как [компьютеры](general/computer.md) в реальной жизни. Игроки, которые любят что-либо мастерить, могут собрать себе робота таким, каким хотят. Если потребуется, устройства могут быть [разобраны](block/disassembler.md). Для [компьютеров](general/computer.md) и [серверов](item/server1.md), компоненты могут быть заменены простым вынимаем из системного блока. 

Устройства OpenComputers совместимы с множеством других модов, что позволяет производить манипуляции над блоками и сущностями (через [адаптер](block/adapter.md) или добавляет специфические улучшения для [роботов](block/robot.md) и [дронов](item/drone.md)). Энергия может быть также получена из других модов, например, Redstone Flux, IndustrialCraft2 EU, Mekanism Joules, Applied Energistics 2 и Factorization Charge. 

Большинство устройств работают под простой операционной системой [OpenOS](general/openOS.md) (за исключением [дронов](item/drone.md) и [микроконтроллеров](block/microcontroller.md). OpenComputers позволяет создавать операционные системы и архитектуры, такими, какими захочет пользователь.

Устройства имеют доступ к таким ресурсам, как [жесткий диск](item/hdd1.md) и [память (RAM)](item/ram1.md). [Микроконтроллеры](block/microcontroller.md) это дешевые [компьютеры](general/computer.md) с меньшим функционалом и компонентами, они не имеют файловой системы, требуют креатива для программирования. [Роботы](block/robot.md) это мобильные [компьютеры](general/computer.md) они могут взаимодействовать с блоками и существами (но не могут взаимодействовать с внешними компонентами OpenComputers). [Дроны](item/drone.md) это быстрые, entity-based [роботы](block/robot.md) с ограниченным функционалом, возможностью двигаться и взаимодействовать с миром отлично от роботов. [Серверы](item/server1.md) продвинутые [компьютеры](general/computer.md) могут содержать много компонентов, позволяют запускать огромные программы и управлять большими сетями. 

Данное руководство содержит детальную информацию обо всех блоках и предметах, о установке систем и устройств, а также введение в программирование на Lua.
