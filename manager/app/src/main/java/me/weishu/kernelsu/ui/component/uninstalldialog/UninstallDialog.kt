package lol.nightmaple.zakusu.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import lol.nightmaple.zakusu.ui.LocalUiMode
import lol.nightmaple.zakusu.ui.UiMode

@Composable
fun UninstallDialog(
    show: Boolean,
    onDismissRequest: () -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(show, onDismissRequest)
        UiMode.Material -> UninstallDialogMaterial(show, onDismissRequest)
    }
}
