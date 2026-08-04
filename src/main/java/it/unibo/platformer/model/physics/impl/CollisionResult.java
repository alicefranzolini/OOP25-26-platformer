package it.unibo.platformer.model.physics.impl;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import it.unibo.platformer.model.physics.api.GameObject;

/**
 * This class give the side of the collision.
 */
@SuppressFBWarnings
public final class CollisionResult {
    private final GameObject dynamicObj;
    private final GameObject staticObj;
    private final CollisionSide side;

    /**
     * the builder of the collision result.
     *
     * @param dynamicObj the first object
     * @param staticObj the second object
     * @param side the side of the collision
     */
    @SuppressFBWarnings
    public CollisionResult(final GameObject dynamicObj, final GameObject staticObj, final CollisionSide side) {
        this.dynamicObj = dynamicObj;
        this.staticObj = staticObj;
        this.side = side;
    }

    /**
     * Gets the dynamic object involved in the collision.
     *
     * @return the GameObjectImpl
     */
    public GameObject getDynamicObj() {
        return this.dynamicObj;
    }

    /**
     * Gets the static object involved in the collision.
     *
     * @return the static object
     */
    public GameObject getStaticObj() {
        return this.staticObj;
    }

    /**
     * Gets the side where the collision happened.
     *
     * @return the side
     */
    public CollisionSide getSide() {
        return this.side;
    }

}
