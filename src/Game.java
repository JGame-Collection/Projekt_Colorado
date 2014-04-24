
/*
 * @author COOLDOG_1337_H4X0R_ROFL_YO_M0MM4
 * @version proto-prototype-snapshot, 12.6234.12 alpha (bugfixed version)
 *
 * @description
 *    This class contains the game loop and some cool comments
 *
 * @anti-description
 *    Don't listen to @description. This class contains hookers and cocaine and fucking NINJAS everywhere!
 */

public class Game {

  public Game(int FRAMERATE){
    this.FRAMERATE = FRAMERATE;
    this.MS_PER_UPDATE = getMsPerUpdate(this.FRAMERATE);
  }

  public Game(){
    this.FRAMERATE = 60;
    this.MS_PER_UPDATE = getMsPerUpdate(this.FRAMERATE);
  }

  private int final FRAMERATE;
  private double final MS_PER_UPDATE;

  private double getMsPerUpdate(int framerate){
    return 0.0;
  }

  public void run(){
    double previous = getCurrentTime();
    double lag = 0.0;
    while(true){
      double current = getCurrentTime();
      double elapsed = current - previous;
      lag += elapsed;

      processInput();

      while(lag >= MS_PER_UPDATE){
        update();
        lag -= MS_PER_UPDATE
      }

      render(lag / MS_PER_UPDATE);
    }
  }
 /*
  * Update can be called multiple times per frame. Update advances the gamestate of all game world entities.
  */
  public void update(){
  }

  /*
   * Render is called once per frame. The parameter "delta" describes the deviation from the last update. It can be between 0 and 1.
   * E.g. a deviation near 0 means, that render is called near simultaneously with the latest update. A deviation near 1 means, that the next update will be called shortly after this render.
   *
   * What does this mean? E.g. an entity moves 100 units per update, and render is called with a delta of 0.5. When the entity was at position 0 at the last update, it will be at position 100 at the next update. Render should show the entity at entity.position + entity.velocity * delta = 50.
   *
   * This extrapolates the position of the entity and eliminates stuttering in the render process.
   */
  public void render(double delta){
  }
}
