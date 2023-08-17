# Chapter 4 - Line Editing
[_Back to outline_](outline.md)

> **Authors pro-tip:**  
> Listen to [this song](https://www.youtube.com/watch?v=DcU4_FuZIkI) while working through the exercises

## Duplicate line ![Mac](./icons/glyph-apple-32.png)`ctrl+d`
Open `Chapter4.java`, move your cursor to line 6 (try and use a shortcut for this), and press ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>d</kbd>.

## Yank ![Mac](./icons/glyph-apple-32.png)<kbd>&#8984;</kbd> + <kbd>backspace</kbd>
Press ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>backspace</kbd> repeatedly to delete the lines.

## Moving lines with and without constraints ![Mac](./icons/glyph-apple-32.png)<kbd>&#8997;</kbd> + <kbd>shift</kbd> + <kbd>&#x2191;</kbd>/<kbd>&#x2193;</kbd> vs. ![Mac](./icons/glyph-apple-32.png)<kbd>shift</kbd> + <kbd>&#8984;</kbd> + <kbd>&#x2191;</kbd>/<kbd>&#x2193;</kbd>
While in `Chapter4.java`, the `System.out.println` function calls are switched around.
Place your cursor on one of the `System.out.println` lines, hold down ![Mac](./icons/glyph-apple-20.png)<kbd>&#8997;</kbd> + <kbd>shift</kbd> and press <kbd>&#x2191;</kbd> or
![Mac](./icons/glyph-apple-20.png)<kbd>&#x2193;</kbd> to move that line.
Do the same for the other line.

You will see the methods aren't in the desired order yet, so place your cursor on `_2_snarf`'s method signature.
This time hold down ![Mac](./icons/glyph-apple-20.png)<kbd>shift</kbd> + <kbd>&#8984;</kbd> and press <kbd>&#x2191;</kbd> or <kbd>&#x2193;</kbd> to move the entire method.

## Start new line ![Mac](./icons/glyph-apple-32.png)<kbd>shift</kbd> + <kbd>enter</kbd>
In `Chapter4.java`, jump to 20:20 (using ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>l</kbd>). From this position we want to start implementing the body of the
method. Typically, one would do this by pressing <kbd>end</kbd>, and then <kbd>enter</kbd>. But you can do this in one go by
pressing ![Mac](./icons/glyph-apple-20.png)<kbd>shift</kbd> + <kbd>enter</kbd>, so let's do just that.

This will come in handy later.

## Join lines ![Mac](./icons/glyph-apple-32.png)<kbd>&#8963;</kbd> + <kbd>shift</kbd> + <kbd>j</kbd>
We want to write the return statement of `_4_thundercats()` on just one line.
Don't use a sequence of ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>&#8594;</kbd>, ![Mac](./icons/glyph-apple-20.png)<kbd>delete</kbd> combinations.
Instead, first select all the thundercats' names (the strings), then press ![Mac](./icons/glyph-apple-20.png)<kbd>&#8963;</kbd> + <kbd>shift</kbd> + <kbd>j</kbd> (for Join lines).

> **HINT:**  
> use ![Mac](./icons/glyph-apple-20.png)<kbd>&#8997;</kbd> + <kbd>&#x2191;</kbd> right after the `{` character.

You might have to repeat the ![Mac](./icons/glyph-apple-20.png)<kbd>&#8963;</kbd> + <kbd>shift</kbd> + <kbd>j</kbd> combination, because IntelliJ's auto-formatting tends to kick in
sometimes.

---
  

[_Next Chapter_](chapter5.md)  

[_Back to outline_](outline.md)