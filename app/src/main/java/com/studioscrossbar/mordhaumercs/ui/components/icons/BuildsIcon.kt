package com.studioscrossbar.mordhaumercs.ui.components.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildsIcon: ImageVector
    get() {
        if (_Person_search != null) {
            return _Person_search!!
        }
        _Person_search = ImageVector.Builder(
            name = "Person_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(440f, 480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                reflectiveQuadToRelative(47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                reflectiveQuadToRelative(113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                reflectiveQuadToRelative(-47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(520f, 320f)
                reflectiveQuadToRelative(-23.5f, -56.5f)
                reflectiveQuadTo(440f, 240f)
                reflectiveQuadToRelative(-56.5f, 23.5f)
                reflectiveQuadTo(360f, 320f)
                reflectiveQuadToRelative(23.5f, 56.5f)
                reflectiveQuadTo(440f, 400f)
                moveTo(884f, 940f)
                lineTo(756f, 812f)
                quadToRelative(-21f, 12f, -45f, 20f)
                reflectiveQuadToRelative(-51f, 8f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 660f)
                reflectiveQuadToRelative(52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                reflectiveQuadToRelative(127.5f, 52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 27f, -8f, 51f)
                reflectiveQuadToRelative(-20f, 45f)
                lineTo(940f, 884f)
                close()
                moveTo(660f, 760f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                reflectiveQuadToRelative(-29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                reflectiveQuadToRelative(-71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                reflectiveQuadToRelative(29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                moveToRelative(-540f, 40f)
                verticalLineToRelative(-111f)
                quadToRelative(0f, -34f, 17f, -63f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(142f, -18f)
                quadToRelative(-12f, 18f, -20.5f, 38.5f)
                reflectiveQuadTo(407f, 601f)
                quadToRelative(-60f, 5f, -107f, 20.5f)
                reflectiveQuadTo(221f, 654f)
                quadToRelative(-10f, 5f, -15.5f, 14.5f)
                reflectiveQuadTo(200f, 689f)
                verticalLineToRelative(31f)
                horizontalLineToRelative(207f)
                quadToRelative(5f, 22f, 13.5f, 42f)
                reflectiveQuadToRelative(20.5f, 38f)
                close()
                moveToRelative(287f, -80f)
            }
        }.build()
        return _Person_search!!
    }

private var _Person_search: ImageVector? = null
