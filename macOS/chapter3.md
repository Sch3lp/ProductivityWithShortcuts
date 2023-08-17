# Chapter 3 - Selection
[_Back to outline_](outline.md)

## Move + Select ![Windows](icons/glyph-windows-32.png)`ctrl+shift+arrows`
Open `Chapter3.java`, then move your cursor to the beginning of the line containing `"jumps over"`, hold
down ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd>, <kbd>shift</kbd> and press the right arrow key <kbd>&#8594;</kbd> to select that sentence.
Now cut and paste it behind the first line.

## Expand Selection ![Windows](icons/glyph-windows-20.png)`ctrl+w`
Press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>n</kbd> and open `Fugly.java`.
Move your cursor to line `23`, column `28` by pressing ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>g</kbd> and typing `23:28`.
From that position press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>w</kbd>, press this key combination again a few times, and see what happens.

Now try using ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>w</kbd> to incrementally reduce the size of your selection. Play around with both the
`Expand selection` and `Reduce selection` key combinations until you feel comfortable with them.

What happens if you keep on pressing that combination?

## Using Selection to help Navigation (e.g. Fluent API)
Because ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>w</kbd> expands a selection, and because the arrow keys decide where our cursor is going to be:
![Windows](icons/glyph-windows-20.png)<kbd>&#8592;</kbd> at the beginning or ![Windows](icons/glyph-windows-20.png)<kbd>&#8594;</kbd> at the end of the selection.

We can use a little trick to format our Fluent API.
Format the one-liner so that it looks like the method below. You can do this by pressing ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>w</kbd> until you have a selection
containing a _"method call"_, e.g. `fugly()`, then press <kbd>&#8594;</kbd> to put your cursor at the end, and press ![Windows](icons/glyph-windows-20.png)<kbd>&#9166;</kbd>
(<kbd>enter</kbd>).

Rinse and repeat.

## Wrapping (IntelliJ feature)
IntelliJ has a neat feature that wraps your selection with braces, curly braces, single or double quotes, ...
You can enable this feature under `Settings` by pressing ![Windows](icons/glyph-windows-20.png)<kbd>&#8984;</kbd> + <kbd>>,</kbd>, then go to `Editor > General >
Smart Keys`, and enable `Surround selection on typing quote or brace`.

An alternative is by pressing ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>a</kbd>, and then type `Smart Keys Braces`.
Fix the `wrapStuff` method by selecting `"efffff"` with ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>w</kbd>, and then type a `"`.
Then apply the same pattern to `yewwww` but instead of a `"`, type a `(`.Then apply the same pattern to the entire method body but type a `{`.

This feature really shines in combination with multi-cursor (which we'll discuss in detail later on).

---

[_Next Chapter_](chapter4.md)
[_Back to outline_](outline.md)