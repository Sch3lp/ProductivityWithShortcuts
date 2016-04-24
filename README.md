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

##Various use cases
### Creating a TestBuilder

### Testing Enum lists

### Extracting from XML

### Making csv lists
