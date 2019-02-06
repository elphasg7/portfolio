
var word = pickWord();
var answerArray = setupAnswerArray(word);
var remainingLetters = word.length;
while (remainingLetters > 0) {
    showPlayerProgress(answerArray);
    var guess = getGuess();
    if (guess === null) {
        break;
    } else if (guess.length !== 1) {
        alert("Please enter a single letter.");
    } else {
        var correctGuesses = updateGameState(guess, word, answerArray);
        remainingLetters -= correctGuesses;
    }
}
showAnswerAndCongratulatePlayer(answerArray);

function pickWord  () {
    // Return a random word
    var words = [
        "javascript",
        "monkey",
        "amazing",
        "pancake",
        "rhythm",
        "rhyming",
        "regret",
        "expel",
        "recharge",
        "exposed",
        "quality",
        "extraordinary"
    ];
   return words[Math.floor(Math.random() * words.length)];
    
};
function setupAnswerArray (word) {
    // Return the answer array
    var answerArray = [];
    for (var i = 0; i < word.length; i++) {
        answerArray[i] = "_";
        
 } return answerArray;
};
function showPlayerProgress (answerArray) {
        // Use alert to show the player their progress
        alert(answerArray.join(" "));
    };
    function getGuess   () {
        // Use prompt to get a guess
        return prompt("Guess a letter, or click Cancel to stop playing.").toLocaleLowerCase();

        /*if (guess === null) {
            // Exit the game loop
            break;
        } else if (guess.length !== 1) {
            alert("Please enter a single letter.");
        }
        else if (answerArray[answerArray.indexOf(guess)] === guess) {
            alert("Repeated the same character!");
            remainingLetters++;
        }*/

    };
    function updateGameState (guess, word, answerArray) {
        // Update answerArray and return a number showing how many
        // times the guess appears in the word so remainingLetters
        // can be updated
        for (var j = 0; j < word.length; j++) {
            if (word[j] === guess) {
                answerArray[j] = guess;
                remainingLetters--;
            }
        }
    };
    function showAnswerAndCongratulatePlayer (answerArray) {
        // Use alert to show the answer and congratulate the player
        alert(answerArray.join(" "));
        alert("Good job! The answer was " + word);
    };
