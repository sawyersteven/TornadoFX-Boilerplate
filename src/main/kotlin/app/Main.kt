package app

import javafx.scene.image.Image
import tornadofx.App
import tornadofx.addStageIcon

class Main : App(MainView::class) {
    init {
        addStageIcon(Image("/app/tornado-fx-logo.png"))
    }
}
