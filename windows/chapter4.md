# Chapter 4 - Line Editing
[_Back to outline_](outline.md)

> **Authors pro-tip:**  
> Listen to [this song](https://www.youtube.com/watch?v=DcU4_FuZIkI) while working through the exercises

## Duplicate line ![Windows](icons/glyph-windows-32.png)`ctrl+d`
Open `Chapter4.java`, move your cursor to line 6 (try and use a shortcut for this), and press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>d</kbd>.

## Yank ![Windows](icons/glyph-windows-20.png)`ctrl+y`
Press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>y</kbd> repeatedly to delete the lines.

> **NOTE:**  
> Similar to the `yank` command in (vim)[https://www.vim.org/], the text you removed is available in your paste-buffer.
> Meaning that pasting will reproduce the lines you just yanked out.

## Moving lines with and without constraints ![Windows](icons/glyph-windows-20.png)`ctrl+shift+up,down` vs. ![Windows](icons/glyph-windows-20.png)`alt+shift+up,down`
While in `Chapter4.java`, the `System.out.println` function calls are switched around.
Place your cursor on one of the `System.out.println` lines, hold down ![Windows](icons/glyph-windows-20.png)<kbd>alt</kbd> + <kbd>shift</kbd> and press <kbd>&#x2191;</kbd> or ![Windows](icons/glyph-windows-20.png)<kbd>&#x2193;</kbd> to move that line.
Do the same for the other line.

You will see the methods aren't in the desired order yet, so place your cursor on `_2_snarf`'s method signature.
This time hold down <kbd>ctrl</kbd> + <kbd>shift</kbd> and press ![Windows](icons/glyph-windows-20.png)<kbd>&#x2191;</kbd> or <kbd>&#x2193;</kbd> to move the entire method.

## Start new line ![Windows](icons/glyph-windows-32.png)`shift+enter`
In `Chapter4.java`, jump to 20:20 (using ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>g</kbd>). From this position we want to start implementing the body of the method.
Typically, one would do this by pressing ![Windows](icons/glyph-windows-20.png)<kbd>end</kbd>, and then ![Windows](icons/glyph-windows-20.png)<kbd>enter</kbd>. But you can do this in one go by
pressing ![Windows](icons/glyph-windows-20.png)<kbd>shift</kbd> + <kbd>enter</kbd>, so let's do just that.

This will come in handy later.

## Join lines ![Windows](icons/glyph-windows-32.png)`ctrl+shift+j`
We want to write the return statement of `_4_thundercats()` on just one line.
Don't use a sequence of ![Windows](icons/glyph-windows-20.png)<kbd>end</kbd> + <kbd>delete</kbd> combinations.
Instead, first select all the thundercats' names (the strings), then press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>j</kbd> (for Join lines).

> **Hint:**  
> use ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>w</kbd> right after the `{` character.

You might have to repeat the ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>j</kbd> combination, because IntelliJ's auto-formatting tends to kick in
sometimes.

---

[_Next Chapter_](chapter5.md)
[_Back to outline_](outline.md)