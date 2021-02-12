package com.example.tema1


enum class CategoryBloodPressure {
    NORMAL,
    ELEVATED,
    HYPERTENSION_STAGE1,
    HYPERTENSION_STAGE2,
    HYPERTENSIVE_CRISIS
}


fun bloodPressure(systolic: Int, diastolic: Int): CategoryBloodPressure {
    lateinit var category: CategoryBloodPressure
    if (systolic < 120 && diastolic < 80) {
        category = CategoryBloodPressure.NORMAL
    } else
        if (systolic in 120..129 && diastolic < 80) {
            category = CategoryBloodPressure.ELEVATED
        } else
            if (systolic in 130..139 || diastolic in 80..89) {
                category = CategoryBloodPressure.HYPERTENSION_STAGE1
            } else
                if (systolic > 180 || diastolic > 120) {
                    category = CategoryBloodPressure.HYPERTENSIVE_CRISIS
                } else
                    if (systolic >= 140 || diastolic >= 90) {
                        category = CategoryBloodPressure.HYPERTENSION_STAGE2
                    }
    return category
}

