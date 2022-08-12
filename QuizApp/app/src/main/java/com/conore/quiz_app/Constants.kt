package com.conore.quiz_app

object Constants {

    fun getQuestions() : ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "Armenia", "Austria",
            1
        )
        val que2 = Question(
            2, "What country does this flag belong to?", R.drawable.ic_flag_of_belgium,
            "Austria", "Brazil", "India", "Belgium",
            4
        )
        val que3 = Question(
            3, "What country does this flag belong to?", R.drawable.ic_flag_of_australia,
            "Denmark", "Germany", "Fiji", "Australia",
            4

        )
        val que4 = Question(
            4, "What country does this flag belong to?", R.drawable.ic_flag_of_brazil,
            "Germany", "Brazil", "India", "Belgium",
            2
        )
        val que5 = Question(
            5, "What country does this flag belong to?", R.drawable.ic_flag_of_fiji,
            "Japan", "Kuwait", "Fiji", "Sudan",
            3
        )
        val que6 = Question(
            6, "What country does this flag belong to?", R.drawable.ic_flag_of_denmark,
            "Denmark", "Germany", "Fiji", "Canada",
            1
        )
        val que7 = Question(
            7, "What country does this flag belong to?", R.drawable.ic_flag_of_india,
            "Thailand", "New Zealand", "Jamaica", "India",
            4
        )
        val que8 = Question(
            8, "What country does this flag belong to?", R.drawable.ic_flag_of_kuwait,
            "Mexico", "Haiti", "Kuwait", "Peru",
            3
        )
        val que9 = Question(
            9, "What country does this flag belong to?", R.drawable.ic_flag_of_germany,
            "Austria", "Germany", "Hungary", "Greenland",
            2
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)

        return questionsList
    }

}