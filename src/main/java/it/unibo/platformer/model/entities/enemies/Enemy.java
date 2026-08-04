package it.unibo.platformer.model.entities.enemies;

import javafx.scene.canvas.GraphicsContext;

/**
 * Defines the behaviors observable by the game system (loops, collisions, HUD)
 * without exposing implementation details.
 */
public interface Enemy {

    /**
     * Updates the enemy's logic for the current frame.
     *
     * @param deltaTime the time elapsed since the last frame, in seconds
     */
    void update(double deltaTime);

    /**
     * Draws this enemy onto the given graphics context.
     *
     * @param gc the {@link GraphicsContext} to render onto
     */
    void render(GraphicsContext gc);

    /**
     * Checks whether this enemy can hurt the player.
     *
     * @return true if this enemy can currently hurt or kill the player
     */
    boolean hitsPlayer();

    /**
     * Checks whether this enemy is walking.
     *
     * @return true if this enemy is currently moving
     */
    boolean isWalking();

    /**
     * Checks whether this enemy is still active.
     *
     * @return true if this enemy is currently active in the game world
     */
    boolean isActive();

    /**
     * Gets the horizontal position of this enemy.
     *
     * @return the horizontal position of this enemy
     */
    double getX();

    /**
     * Gets the vertical position of this enemy.
     *
     * @return the vertical position of this enemy
     */
    double getY();

    /**
     * Gets the width of this enemy.
     *
     * @return the width of this enemy
     */
    double getWidth();

    /**
     * Gets the height of this enemy.
     *
     * @return the height of this enemy
     */
    double getHeight();
}
