https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package signpost;

/** A type of InputSource that receives commands from a GUI.
 *  @author P. N. Hilfinger
 */
class GUISource implements CommandSource {

    /** Provides input from SOURCE. */
    GUISource(GUI source) {
        _source = source;
    }

    @Override
    public String getCommand() {
        return _source.readCommand().toUpperCase();
    }

    /** Input source. */
    private GUI _source;

}
