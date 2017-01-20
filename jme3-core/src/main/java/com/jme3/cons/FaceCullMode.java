package com.jme3.cons;

import com.jme3.material.RenderState;

/**
 * <code>FaceCullMode</code> specifies the criteria for faces to be culled.
 *
 * @see RenderState#setFaceCullMode(FaceCullMode)
 */
public enum FaceCullMode {

    /**
     * Face culling is disabled.
     */
    Off,
    /**
     * Cull front faces
     */
    Front,
    /**
     * Cull back faces
     */
    Back,
    /**
     * Cull both front and back faces.
     */
    FrontAndBack
}
