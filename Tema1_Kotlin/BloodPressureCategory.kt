package com.example.tema1


enum class CategoryBloodPressure {
    NORMAL,
    ELEVATED,
    HYPERTENSION_STAGE1,
    HYPERTENSION_STAGE2,
    HYPERTENSIVE_CRISIS
}


fun bloodPressure(systolic: Int, diastolic: Int) = when {
    systolic > 180 || diastolic > 120 -> println(CategoryBloodPressure.HYPERTENSIVE_CRISIS)
    systolic >= 140 || diastolic >= 90 -> println(CategoryBloodPressure.HYPERTENSION_STAGE2)
    systolic >= 130 || diastolic >= 80 -> println(CategoryBloodPressure.HYPERTENSION_STAGE1)
    systolic >= 120 -> println(CategoryBloodPressure.ELEVATED)
    else -> println(CategoryBloodPressure.NORMAL)
}
