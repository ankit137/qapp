package com.example.quizapp

object setData {
    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var question1=QuestionData(
            1,
            "What is Capital of INDIA?",
            "UP",
            "MP",
            "DELHI",
            "LUCKNOW",
            3


        )
        var question2=QuestionData(
            2,
            "What is National animal of INDIA?",
            "LION",
            "MONKEY",
            "DONKEY",
            "TIGER",
            4


        )
        var question3=QuestionData(
            3,
            "What is National bird of INDIA?",
            "PEACOCK",
            "SPARROW",
            "DOVE",
            "CROW",
            1


        )
        var question4=QuestionData(
            4,
            "What is Currency of INDIA?",
            "EURO",
            "RUPEE",
            "DINAR",
            "DOLLAR",
            2


        )
        var question5=QuestionData(
            5,
            "How many states are there in INDIA?",
            "20",
            "39",
            "28",
            "12",
            3


        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)

        return que
    }
}