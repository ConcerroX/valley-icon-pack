package concerrox.valley

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import concerrox.valley.iconpackmaker.IconPackMakerApp

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Valley",
    ) {
        IconPackMakerApp()
    }
}