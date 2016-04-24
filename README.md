# Chapter 8 - Multiple Cursors
The feature you've all been waiting for: _Multiple Cursors_!

This is probably the most powerful and useful feature any text editor could have. But sadly enough, it might be the most underused one as well because it's harder to grasp.

So take a breather, and make sure you're awake for this chapter.

## Toggle Column Mode `alt+shift+insert`
For starters, let's introduce you to _Column Mode_.

Let's open `Chapter8`. The `output` variable contains a long string concatenation, but there are a few problems with it:
* the `+` is missing to actually DO the concatenation
* and there's a space missing at the end of every string

You could put your cursor at the beginning of the second line, type a `+`, and then press `down` and `home` and type a `+` again, **repeat that for every line**, but there's an easier way.

Since all of the strings are lined up perfectly wouldn't it be easier if we could first put a bunch of cursors in front of every line, and then just type `+`? Let's try just that.

First position your cursor to the **beginning** of the second string (`"one hell of a"`).

While watching the bottom right of your screen press `alt+shift+insert` once.

You should see the word `Column` appear next to `UTF-8`. This means you have just toggled on `Column Mode`.

Now, hold down `shift` and press `down` until you've reached the last string (`"of column mode"`). There should be a cursor blinking at the beginning of every line.
It might look like one giant cursor, but it is in fact a bunch of them.

Now simply type a `+` and be amazed.

Exit out of your multi-cursors by pressing `Escape`. Exit out of _Column Mode_ by pressing `alt+shift+insert` again. The word `Column` should not appear anymore in the bottom right.

This still leaves the issue of all of the strings not having a space at the end though.

Let's undo our changes by pressing `ctrl+z` and let's take a different approach. Notice how `ctrl+z`'ing once puts the multiple cursors back.

Now, what we really want is a `+` at the **end** of every string, and to add a space inside all the strings. Here's how you could do that.

Instead of putting your cursor at the beginning of the second line, put it at the beginning of the **first** line (`"This sure is"`).

Toggle _Column Mode_ again with `alt+shift+insert`, and select all the lines again by repeatedly pressing `down` until you've reached the second last string.

Now press `End`. Notice how the cursors are all at different ending positions.

First let's add the spaces so our strings aren't concatenated right against each other. Move your cursor inside of the string by pressing `left` once. Then type a `space`.

Then press `End` again and type a `+`. `Escape` out of the multicursor and disable _Column Mode_ by pressing `alt+shift+insert`.

This is a great feature for when all the lines you want to edit are right underneath each other, but that won't always be the case.

Let's see how we can solve that issue as well.

## `alt+j`, `alt+shift+j` and `ctrl+alt+shift+j`
In `Chapter8` there are two methods that need some fixing. They both tried to use a `StringBuilder` but seemed to have forgotten that you need the `append()` method.

We can't use _Column Mode_ because the same mistake is repeated in a different method and there are lines in between that we don't want to put a cursor at.

We can, however, use `alt+j` to add a cursor to a _Find buffer_ (`F3` and `ctrl+F3`).

Try to think for a moment what selection you'd want to _Find_ in that class.

Let's first try to see what would be included by `ctrl+F3`'ing on the following selections: `"`, `.`, `."`.

Spoiler:

`"` won't be good, because then we'd also end up with a cursor at the end of the string.

`.` won't be good either, because we don't want to include the `.toString()`.

`."` however is a near perfect fit.

So let's select the first `."` at `21:17` and press `alt+j` once and see what happens.

Now repeat `alt+j` until you've selected all of the occurrences.

You'll notice that the last occurrence is working code, and we didn't want that last one. So press `alt+shift+j` to undo that last `add to cursor` selection.

Then let's fix the code by typing `append` after the `.`. Don't exit out of your multi-cursor just yet.

Remember how in Chapter 3 we learned about IntelliJ's _Wrapping_ feature? And how I said it was gonna shine in this chapter?

If you haven't already, enable Wrapping with `ctrl+shift+a`, `smart braces`, `enter`.

From the multi-cursors positioned after the `append` you just typed, press `shift+end` to select all the strings, and then press `(`.

As an alternative to repeatedly pressing `alt+j`, and if you're 100% sure that you won't include too much, you can also press `ctrl+alt+shift+j` and add **all** occurrences to your cursors in one go.

Undo `ctrl+z` your corrections and try it out.

Notice how `alt+shift+j` still deselects the last occurrence. This is because `ctrl+alt+shift+j` is merely a repeated `alt+j`.

##Various use cases
### Creating a TestBuilder

### Testing Enum lists

### Extracting from XML

### Making csv lists
