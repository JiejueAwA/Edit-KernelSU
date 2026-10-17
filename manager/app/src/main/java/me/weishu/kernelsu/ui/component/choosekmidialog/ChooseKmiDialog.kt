package lol.nightmaple.zakusu.ui.component.choosekmidialog

import androidx.compose.runtime.Composable
import lol.nightmaple.zakusu.ui.LocalUiMode
import lol.nightmaple.zakusu.ui.UiMode

@Composable
fun ChooseKmiDialog(
    show: Boolean,
    onDismissRequest: () -> Unit,
    onSelected: (String?) -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> ChooseKmiDialogMiuix(show, onDismissRequest, onSelected)
        UiMode.Material -> ChooseKmiDialogMaterial(show, onDismissRequest, onSelected)
    }
}
