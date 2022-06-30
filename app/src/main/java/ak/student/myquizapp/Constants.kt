package ak.student.myquizapp

object Constants {
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_questions"
    const val CORRECT_ANSWERS: String="correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val ques1=Question(1,"What country does this flag belong to?",
        R.drawable.ic_flag_of_argentina,"Argentina","Australia",
        "Armenia", "Austria",1)
        questionsList.add(ques1)
        val ques2=Question(2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,"Hungary","United States Of America",
            "Armenia", "New Zealand",4)
        questionsList.add(ques2)
        val ques3=Question(3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,"Iran","India",
            "Italy", "Ireland",2)
        questionsList.add(ques3)
        val ques4=Question(4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,"Angola","Austria",
            "Australia", "Armenia",3)
        questionsList.add(ques4)
        val ques5=Question(5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,"Gabon","France",
            "Fiji", "Finland",3)
        questionsList.add(ques5)
        val ques6=Question(6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,"Belarus","Belize",
            "Belgium", "Brazil",4)
        questionsList.add(ques6)
        val ques7=Question(7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,"Bahamas","Belgium",
            "Barbados", "Belize",2)
        questionsList.add(ques7)
        val ques8=Question(8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,"Germany","Georgia",
            "Greece", "None Of These",1)
        questionsList.add(ques8)
        val ques9=Question(9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,"Dominica","Egypt",
            "Denmark", "Ethiopia",3)
        questionsList.add(ques9)
        val ques10=Question(10,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,"Jordan","Kuwait",
            "Sudan", "Palestine",2)
        questionsList.add(ques10)


        return questionsList
    }
}