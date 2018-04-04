package org.glavo.viewer.util

import org.intellij.lang.annotations.Language

const val UI_CLASS = "viewer-ui"

const val TEXT_CLASS = "viewer-text"

@Language("CSS")
val defaultCSS: String =
        """
.$TEXT_CLASS {
    -fx-font-family: "$defaultTextFontFamily";
    -fx-font-size: 15;
}

.$UI_CLASS {
    -fx-font-family: "$defaultUiFontFamily";
    -fx-font-size: 15;
}

.root {
    -fx-background-radius: 20;
}

.button {
    -fx-background-color: transparent;
    -fx-padding: 0.333333em 0.666667em 0.333333em 0.666667em; /* 4 8 4 8 */
}

.button:hover {
    -fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;
    -fx-background-insets: 0 0 -1 0, 0, 1, 2;
    -fx-background-radius: 3px, 3px, 2px, 1px;
    -fx-padding: 0.333333em 0.666667em 0.333333em 0.666667em; /* 4 8 4 8 */
    -fx-text-fill: -fx-text-base-color;
    -fx-alignment: CENTER;
    -fx-content-display: LEFT;
}

.combo-box {
    -fx-background-color: transparent;
}

.combo-box:hover {
    -fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;
    -fx-text-fill: -fx-text-base-color;
    -fx-alignment: CENTER;
    -fx-content-display: LEFT;
}

.combo-box .arrow, .combo-box .arrow-button{
    -fx-background-color: transparent;
}"""