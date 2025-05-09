// get random word function and return to main
fun randomWord(): String {
    // list of words
    val words = arrayOf("marvel", "banana", "journey", "candle",
    "pirate", "window", "thunder", "rocket", "muffin", "lantern",
    "velvet", "sunrise", "forest", "whisper", "granite", "pipe",
    "congratulations", "loser", "plane", "airplane", "sky", "fox",
    "cat", "hamburger", "cheese", "chess", "quote", "hangman", "beard",
    "dog", "bishop", "rook", "king", "queen", "lightning", "geography",
    "fire", "biology", "bibliography", "diet", "doctor", "hat", "laptop",
    "california", "current", "search", "computer", "random", "earth", "bread",
    "ocean", "shark", "sunset", "beach", "assistant", "engine", "helicopter",
    "ice", "jam", "zebra", "grape", "clock", "nugget", "dragon", "pencil",
    "giraffe", "maze", "triangle", "backpack", "saxophone", "avalanche",
    "telescope", "encyclopedia", "microphone", "architecture", "transformation",
    "xylophone", "glue", "robot", "festival", "watermelon", "umbrella", "volcano",
    "waterfall", "trampoline", "caterpillar", "moonlight", "adventure", "notebook",
    "calculator", "balloon", "carousel", "treasure", "spaceship", "kangaroo",
    "yesterday", "barbeque", "butterfly", "elephant", "stapler", "pencil", "corn")
return words.random()
}

fun main() {
    println("Welcome to Hangman")
    //get random word
    val word = randomWord()
    val len = word.length
    println(len)
    var wrongGuess = 0
    var userWord = ""


    //get the amount of letters in the word
    for(letters in word) {
        userWord += "_"
    }
    val uword = StringBuilder(userWord)


    //Hangman Game
    while (wrongGuess < 5 && uword.toString() != word) {
        var count = 0
        println(uword)
        println()
        print("Guess a Letter:  ")
        val userLetter = readlnOrNull()
        val letter = userLetter.toString()[0]


// check to see if the letter is in the word

        //Letter is in the word
        if (letter in word){
        while (count < len){
            if(word[count] == letter){
                uword[count] = letter
                }
                count += 1
            }
        }

        //Letter is not in the word Draw hangman
        else{
            println("Incorrect Letter 😔")
            wrongGuess += 1
            repeat(2){ println()}
      when (wrongGuess) {
          1 -> println(" |||||||")
          2 -> {
              println(" |||||||")
              println("( ' _ ' )")
          }

          3 -> {
              println(" |||||||")
              println("( ' _ ' )")
              println("_________")
          }

          4 -> {
              println(" |||||||")
              println("( ' _ ' )")
              println("_________")
              println("    |    ")
              println("    |    ")
          }

          5 -> {
              println(" |||||||")
              println("( ' _ ' )")
              println("_________")
              println("    |    ")
              println("    |    ")
              println("  _l l_ ")

              repeat(2) { println() }
              println("😭😭 YOU LOSE 😭😭")
          }
      }
            Thread.sleep(2000)
        }
        if(uword.toString() == word) {
            println("🎉 CONGRATULATIONS 🎉")
            println("🎉🥳 YOU 🎊 WIN 🥳🎉")
        }

    }
    println("Would you like to play again? (y/n): ")
    val userGame = readlnOrNull()
    if (userGame == "y"){
        main()
    }
    else {
        println("Goodbye!")
    }
}

// 12.5 hours total
// 1 hour writing README
// 1 hour adding words
// 1 hour module plan
// 1 hour setting up Github and intelliJ
// 1 hour research on kotlin language
// .5 hour learning to set Github with kotlin and pushing
// 3.5 hours writing the game up
// 1 hours debugging
// .5 hours troubleshooting
// 1 hour learning and adding "WHEN" keyword
// 1 hour creating and uploading video


//Websites I used
//https://www.geeksforgeeks.org/kotlin-when-expression/
//https://www.w3schools.com/KOTLIN/kotlin_data_types.php
//https://www.baeldung.com/kotlin/random-number
//https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-string-builder/
