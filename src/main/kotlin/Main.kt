

// ADD WHEN KEYWORD

// get random word function and return to main
fun randomWord(): String {
    // list of words
    val words = arrayOf("marvel", "banana", "journey", "candle", "pirate", "window", "thunder", "rocket", "muffin", "lantern", "velvet", "sunrise", "forest", "whisper", "granite")
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
            if (wrongGuess == 1) {
                println(" |||||||")
            }
            else if (wrongGuess == 2){
                println(" |||||||")
                println("( ' _ ' )")
            }
            else if (wrongGuess == 3){
                println(" |||||||")
                println("( ' _ ' )")
                println("_________")
            }
            else if (wrongGuess == 4){
                println(" |||||||")
                println("( ' _ ' )")
                println("_________")
                println("    |    ")
                println("    |    ")
            }
            else{
                println(" |||||||")
                println("( ' _ ' )")
                println("_________")
                println("    |    ")
                println("    |    ")
                println(" _l   l_ ")
                repeat(2) { println() }
                println("😭😭 YOU LOSE 😭😭")
            }
            repeat(2) { println() }
            Thread.sleep(3000)
        }
        if(uword.toString() == word) {
            println("🎉 CONGRATULATIONS 🎉")
            println("🎉🥳 YOU 🎊 WIN 🥳🎉")
        }

    }
}

// Hours Working on it 6 hours
// 1 hour module plan
// 1 hour research
// 2.5 hours writing code
// 1 hours debugging
// .5 hours troubleshooting



//Websites I used
//https://www.w3schools.com/KOTLIN/kotlin_data_types.php
//https://www.baeldung.com/kotlin/random-number
//https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-string-builder/