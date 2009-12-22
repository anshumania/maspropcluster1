package biz.karms.hidato.app.util.impl;

import com.masprop.cluster1.shared.model.GameVariant;

/**
 * Thin enum
 * @author Michal "Karm" Babacek
 * @see Game
 * @version 1.0
 * @since 1.0
 */
public enum GameVariantImpl implements GameVariant {

    /**
     * Rectangular shape.
     */
    RECTANGULAR_SHAPE,

    /**
     * Oval shape.
     */
    OVAL_SHAPE,

    /**
     * Donut shape.
     */
    DONUT_SHAPE;
}
