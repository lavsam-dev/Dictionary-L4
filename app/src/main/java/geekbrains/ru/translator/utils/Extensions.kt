package geekbrains.ru.translator.utils

import android.content.Context
import android.widget.Toast

fun String.Companion.getEmptyString(): String = ""

fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}
