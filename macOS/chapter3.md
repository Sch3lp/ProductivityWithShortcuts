# Chapter 3 - Selection
[_Back to outline_](outline.md)

## Move + Select ![Windows](icons/glyph-windows-32.png)`ctrl+shift+arrows`
Open `Chapter3.java`, then move your cursor to the beginning of the line containing `"jumps over"`, hold
down <kbd>&#8984;</kbd>, <kbd>shift</kbd> and press the right arrow key <kbd>&#8594;</kbd> to select that sentence.
Now cut and paste it behind the first line.

## Expand Selection ![Windows](icons/glyph-windows-20.png)`ctrl+w`
Press <kbd>&#8984;</kbd> + <kbd>o</kbd> and open `Fugly.java`.
Move your cursor to line `23`, column `28` by pressing <kbd>&#8984;</kbd> + <kbd>l</kbd> and typing `23:28`.
From that position press <kbd>&#8997;</kbd> + <kbd>&#x2191;</kbd>, press this key combination again a few times, and see what happens.

Now try using  <kbd>&#8997;</kbd> + <kbd>shift</kbd> + <kbd>&#x2191;</kbd> to incrementally reduce the size of your selection. Play around with both the
`Expand selection` and `Reduce selection` key combinations until you feel comfortable with them.

What happens if you keep on pressing that combination?

## Using Selection to help Navigation (e.g. Fluent API)
Because <kbd>&#8997;</kbd> + <kbd>&#x2191;</kbd> expands a selection, and because the arrow keys decide where our cursor is going to be:
<kbd>&#8592;</kbd> at the beginning or <kbd>&#8594;</kbd> at the end of the selection.

We can use a little trick to format our Fluent API.
Format the one-liner so that it looks like the method below. You can do this by pressing <kbd>&#8997;</kbd> + <kbd>&#x2191;</kbd> until you have a selection
containing a _"method call"_, e.g. `fugly()`, then press <kbd>&#8594;</kbd> to put your cursor at the end, and press <kbd>&#9166;</kbd>
(<kbd>enter</kbd>).
Rinse and repeat.

## Wrapping (IntelliJ feature)
IntelliJ has a neat feature that wraps your selection with braces, curly braces, single or double quotes, ...
You can enable this feature under `Settings` by pressing <kbd>&#8984;</kbd> + <kbd>,</kbd>, then go to `Editor > General >
Smart Keys`,package be.swsb.productivity.chapter3;

public class Chapter3 {

    public String selectStuff() {
        return "The quick brown fox " +
                "jumps over " +
                "the LazyDawg";
    }
}

and enable `Surround selection on typing quote or brace`.

An alternative is by pressing <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>a</kbd>, and then type `Smart Keys Braces`.
Fix the `wrapStuff` method by selecting `"efffff"` with <kbd>&#8997;</kbd> + <kbd>&#x2191;</kbd>s, and then type a `"`.
Then apply the same pattern to `yewwww` but instead of a `"`, type a `(`.Then apply the same pattern to the entire method body but type a `{`.

This feature really shines in combination with multi-cursor (which we'll discuss in detail later on).

---

[_Next Chapter_](chapter4.md)
[_Back to outline_](outline.md)