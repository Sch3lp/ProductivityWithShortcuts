# Chapter 4 - Line Editing
[_Back to outline_](outline.md)
##Duplicate line ![Windows](icons/glyph-windows-32.png)`ctrl+d`
Open `Chapter4.java`, move your cursor to line 6, press ![Windows](icons/glyph-windows-20.png)`ctrl+d`.

##Yank ![Windows](icons/glyph-windows-20.png)`ctrl+y`
Press ![Windows](icons/glyph-windows-20.png)`ctrl+y` repeatedly to delete the lines.

##Moving lines with and without constraints ![Windows](icons/glyph-windows-20.png)`ctrl+shift+up,down` vs. ![Windows](icons/glyph-windows-20.png)`alt+shift+up,down`
Right now in `Chapter4.java`, the `System.out.println`'s are switched around.

Place your cursor on one of the `System.out.println`'s, hold down ![Windows](icons/glyph-windows-20.png)`alt+shift` and press ![Windows](icons/glyph-windows-20.png)`up` or ![Windows](icons/glyph-windows-20.png)`down` to move that line.

Do the same for the other line.

Now the methods aren't in order yet, so place your cursor on `_2_snarf`'s method signature, but this time hold down ![Windows](icons/glyph-windows-20.png)`ctrl+shift` and press `up` or `down` to move the entire method.

##Start new line ![Windows](icons/glyph-windows-32.png)`shift+enter`
In `Chapter4.java`, go to 20:20. From this position we want to start implementing the methods body.

Typically, one would do this by pressing `end`, and then `enter`. But you can do this in one go by pressing ![Windows](icons/glyph-windows-20.png)`shift+enter`, so let's do just that.

It'll come in handy later.

##Join lines ![Windows](icons/glyph-windows-32.png)`ctrl+shift+j`
We want to write the return statement of `_4_thundercats()` on just one line.

Don't do `end`, `delete`, `end`, `delete`, ...

Instead, first select all of the thundercats names (the strings), then press ![Windows](icons/glyph-windows-20.png)`ctrl+shift+j` (for Join lines). Hint: ![Windows](icons/glyph-windows-20.png)`ctrl+w` right after the `{`.

You might have to repeat the ![Windows](icons/glyph-windows-20.png)`ctrl+shift+j` combination, because IntelliJ's auto-formatting kicks in sometimes.

[_Next Chapter](chapter5.md)

[_Back to outline_](outline.md)