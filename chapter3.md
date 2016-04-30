# Chapter 3 - Selection
[_Back to outline_](outline.md)
## Move + Select ![Windows](icons/glyph-windows-32.png)`ctrl+shift+arrows`
Open `Chapter3.java`, then move your cursor to the beginning of `"jumps over"`, hold down ![Windows](icons/glyph-windows-20.png)`ctrl` and ![Windows](icons/glyph-windows-20.png)`shift` and press the ![Windows](icons/glyph-windows-20.png)`right` arrow to select that sentence and cut and paste it behind the first line.

## Expand Selection ![Windows](icons/glyph-windows-20.png)`ctrl+w`
Press ![Windows](icons/glyph-windows-20.png)`ctrl+n` and open `Fugly.java`.

Move your cursor to line 23, column 28 by pressing ![Windows](icons/glyph-windows-20.png)`ctrl+g` and typing `23:28`.

From that position press ![Windows](icons/glyph-windows-20.png)`ctrl+w`, keep pressing it again, and see what happens.

What happens if you keep on pressing it?

Try using ![Windows](icons/glyph-windows-20.png)`ctrl+shift+w` and see what that does.

What happens if you keep on pressing that combination?

## Using Selection to help Navigation (e.g. Fluent API)
Because ![Windows](icons/glyph-windows-20.png)`ctrl+w` expands a selection,

and because the arrow keys decide where our cursor is going to be: `left` at the beginning or `right` at the end of the selection.

We can use a little trick to format our Fluent API.

Format the one-liner so that it looks like the method below. You can do this by pressing ![Windows](icons/glyph-windows-20.png)`ctrl+w` until you have a selection containing a "method call", e.g. `fugly()`, then press `right` to put your cursor at the end, and press ![Windows](icons/glyph-windows-20.png)`enter`.

Rinse and repeat.

## Wrapping (IntelliJ feature)
IntelliJ has a neat feature that wraps your selection with braces, curly braces, single or double quotes, ...

You can enable this feature under `Settings` by pressing ![Windows](icons/glyph-windows-20.png)`ctrl+alt+s`, then go to `Editor > General > Smart Keys`, and enable `Surround selection on typing quote or brace`.

An alternative is by pressing ![Windows](icons/glyph-windows-20.png)`ctrl+shift+a`, and then type `Smart Keys Braces`.

Fix the `wrapStuff` method by selecting `"efffff"` with ![Windows](icons/glyph-windows-20.png)`ctrl+w`, and then type a `"`.

Then apply the same pattern to `yewwww` but instead of a `"`, type a `(`.

Then apply the same pattern to the entire method body but type a `{`.

This feature really shines in combination with multi-cursor (which we'll see in a later chapter).

[_Back to outline_](outline.md)