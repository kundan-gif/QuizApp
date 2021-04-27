package com.example.quiz

object Constants {
    const val USER_NAME="user_name"
    const val TOTAL_QUESTIONS="total_question"
    const val CORRECT_ANSWERS="correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que1)
        val que2 = Question(
            2,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que2)
        val que3 = Question(
            3,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que3)
        val que4 = Question(
            4,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que4)
        val que5 = Question(
            5,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que5)
        val que6 = Question(
            6,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que6)
        val que7 = Question(
            7,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que7)
        val que8 = Question(
            8,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que8)
        val que9 = Question(
            9,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que9)
        val que10 = Question(
            10,
            "What will be the output of the following code?",
            R.drawable.q1,
            "2",
            "1",
            "4",
            "3",
            1
        )
        questionList.add(que10)
        return questionList
    }
}