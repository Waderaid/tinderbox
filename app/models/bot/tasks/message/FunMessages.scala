package models.bot.tasks.message

/**
 * A list of fun, pre-defined message trees.
 */
object FunMessages {

  def messages = List(
    MessageTree(
      value = "{name} are you a fan of avocados?",
      right = Some(MessageTree(
        value = "So if I asked you to have a guacamole party with me you'd do it?",
        right = None,
        left = None
      )),
      left = Some(MessageTree(
        value = "Do women love anything more than avocados?",
        right = None,
        left = None
      ))
    ),
     MessageTree(
      value = "{name} Have any crazy stories from your last adventure?",
      right = Some(MessageTree(
        value = "Sounds like fun!  I am a really boring person too, HaHa! I just go sailing to Catalina on weekends and scuba dive.  Do you have anything planned for the weekend?",
        right = None,
        left = None
      )),
      left = Some(MessageTree(
        value = "I just talked to my psychic Cleo and she told me I will meet someone interesting today, Is she talking about you? HaHa",
        right = None,
        left = None
      ))
    ),
    MessageTree(
      value = "I can't wait to introduce you to my mom!",
      right = Some(MessageTree(
        value = "Since mom showed everyone my naked baby pictures, I've been looking for ways to get her back.  Would it be weird if you both were the same age?? HaHa",
        right = None,
        left = None
      )),
      left = None
    )
  )

}
