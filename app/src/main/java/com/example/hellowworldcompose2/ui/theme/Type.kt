package com.example.hellowworldcompose2.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.hellowworldcompose2.R


val myCustomFontFamily = FontFamily(
    Font(R.font.sofiasans_semibold, FontWeight.Light),
/*    Font(R.font.my_font_regular, FontWeight.Normal),
    Font(R.font.my_font_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.my_font_medium, FontWeight.Medium),
    Font(R.font.my_font_bold, FontWeight.Bold)*/
)
// Set of Material typography styles to start with
val typography = Typography(
    headlineSmall = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

//val Typography = Typography(
//    bodyLarge = TextStyle(
//        fontWeight = FontWeight.Normal,
//        fontSize = 2000.sp,
//        lineHeight = 10.sp,
//        letterSpacing = 0.5.sp),
//    titleLarge = TextStyle(
//        fontWeight = FontWeight.SemiBold,
//        fontSize = 18.sp,
//        lineHeight = 28.sp,
//        letterSpacing = 0.sp
//    ),
///*    bodyLarge = TextStyle(
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.15.sp
//    ),*/
//
//    bodyMedium = TextStyle(
//        fontWeight = FontWeight.Medium,
//        fontSize = 2.sp,
//        lineHeight = 20.sp,
//        letterSpacing = 0.1.sp
//    ),
//    labelMedium = TextStyle(
//        fontWeight = FontWeight.SemiBold,
//        fontSize = 12.sp,
//        lineHeight = 16.sp,
//        letterSpacing = 0.5.sp
//    ),
///*    Other default text styles to override
//    titleLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 22.sp,
//        lineHeight = 28.sp,
//        letterSpacing = 0.sp
//    ),*/
//    labelSmall = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Medium,
//        fontSize = 11.sp,
//        lineHeight = 16.sp,
//        letterSpacing = 0.5.sp
//    )
//
//)
