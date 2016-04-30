# Chapter 8 - Multiple Cursors
[_Back to outline_](outline.md)

The feature you've all been waiting for: _Multiple Cursors_!

This is probably the most powerful and useful feature any text editor could have. But sadly enough, it might be the most underused one as well because it's harder to grasp.

So take a breather, and make sure you're awake for this chapter.

## Toggle Column Mode ![Windows](icons/glyph-windows-32.png)`alt+shift+insert`
For starters, let's introduce you to _Column Mode_.

Let's open `Chapter8`. The `output` variable contains a long string concatenation, but there are a few problems with it:
* the `+` is missing to actually DO the concatenation
* and there's a space missing at the end of every string

You could put your cursor at the beginning of the second line, type a `+`, and then press `down` and `home` and type a `+` again, **repeat that for every line**, but there's an easier way.

Since all of the strings are lined up perfectly wouldn't it be easier if we could first put a bunch of cursors in front of every line, and then just type `+`? Let's try just that.

First position your cursor to the **beginning** of the second string (`"one hell of a"`).

While watching the bottom right of your screen press ![Windows](icons/glyph-windows-20.png)`alt+shift+insert` once.

You should see the word `Column` appear next to `UTF-8`. This means you have just toggled on `Column Mode`.

Now, hold down ![Windows](icons/glyph-windows-20.png)`shift` and press `down` until you've reached the last string (`"of column mode"`). There should be a cursor blinking at the beginning of every line.
It might look like one giant cursor, but it is in fact a bunch of them.

Now simply type a `+` and be amazed.

Exit out of your multi-cursors by pressing `Escape`. Exit out of _Column Mode_ by pressing ![Windows](icons/glyph-windows-20.png)`alt+shift+insert` again. The word `Column` should not appear anymore in the bottom right.

This still leaves the issue of all of the strings not having a space at the end though.

Let's undo our changes by pressing ![Windows](icons/glyph-windows-20.png)`ctrl+z` and let's take a different approach. Notice how ![Windows](icons/glyph-windows-20.png)`ctrl+z`'ing once puts the multiple cursors back.

Now, what we really want is a `+` at the **end** of every string, and to add a space inside all the strings. Here's how you could do that.

Instead of putting your cursor at the beginning of the second line, put it at the beginning of the **first** line (`"This sure is"`).

Toggle _Column Mode_ again with ![Windows](icons/glyph-windows-20.png)`alt+shift+insert`, and select all the lines again by repeatedly pressing `down` until you've reached the second last string.

Now press ![Windows](icons/glyph-windows-20.png)`End`. Notice how the cursors are all at different ending positions.

First let's add the spaces so our strings aren't concatenated right against each other. Move your cursor inside of the string by pressing `left` once. Then type a `space`.

Then press ![Windows](icons/glyph-windows-20.png)`End` again and type a `+`. `Escape` out of the multicursor and disable _Column Mode_ by pressing ![Windows](icons/glyph-windows-20.png)`alt+shift+insert`.

This is a great feature for when all the lines you want to edit are right underneath each other, but that won't always be the case.

Let's see how we can solve that issue as well.

## ![Windows](icons/glyph-windows-32.png)`alt+j`, ![Windows](icons/glyph-windows-32.png)`alt+shift+j` and ![Windows](icons/glyph-windows-32.png)`ctrl+alt+shift+j`
In `Chapter8` there are two methods that need some fixing. They both tried to use a `StringBuilder` but seemed to have forgotten that you need the `append()` method.

We can't use _Column Mode_ because the same mistake is repeated in a different method and there are lines in between that we don't want to put a cursor at.

We can, however, use ![Windows](icons/glyph-windows-20.png)`alt+j` to add a cursor to a _Find buffer_ (![Windows](icons/glyph-windows-20.png)`F3` and ![Windows](icons/glyph-windows-20.png)`ctrl+F3`).

Try to think for a moment what selection you'd want to _Find_ in that class.

Let's first try to see what would be included by ![Windows](icons/glyph-windows-20.png)`ctrl+F3`'ing on the following selections: `"`, `.`, `."`.

Spoiler:

`"` won't be good, because then we'd also end up with a cursor at the end of the string.

`.` won't be good either, because we don't want to include the `.toString()`.

`."` however is a near perfect fit.

So let's select the first `."` at `21:17` and press ![Windows](icons/glyph-windows-20.png)`alt+j` once and see what happens.

Now repeat ![Windows](icons/glyph-windows-20.png)`alt+j` until you've selected all of the occurrences.

You'll notice that the last occurrence is working code, and we didn't want that last one. So press ![Windows](icons/glyph-windows-20.png)`alt+shift+j` to undo that last `add to cursor` selection.

Then let's fix the code by typing `append` after the `.`. Don't exit out of your multi-cursor just yet.

Remember how in Chapter 3 we learned about IntelliJ's _Wrapping_ feature? And how I said it was gonna shine in this chapter?

If you haven't already, enable Wrapping with ![Windows](icons/glyph-windows-20.png)`ctrl+shift+a`, `smart braces`, `enter`.

From the multi-cursors positioned after the `append` you just typed, press ![Windows](icons/glyph-windows-20.png)`shift+end` to select all the strings, and then press `(`.

As an alternative to repeatedly pressing ![Windows](icons/glyph-windows-20.png)`alt+j`, and if you're 100% sure that you won't include too much, you can also press ![Windows](icons/glyph-windows-20.png)`ctrl+alt+shift+j` and add **all** occurrences to your cursors in one go.

Undo ![Windows](icons/glyph-windows-20.png)`ctrl+z` your corrections and try it out.

Notice how ![Windows](icons/glyph-windows-20.png)`alt+shift+j` still deselects the last occurrence. This is because ![Windows](icons/glyph-windows-20.png)`ctrl+alt+shift+j` is merely a repeated ![Windows](icons/glyph-windows-20.png)`alt+j`.

##Various use cases
Now that we've seen the basics of multiple cursors, let's try to apply it to some day to day tasks and see how it can make your life so much easier.

### Creating a TestBuilder
Let's pretend we've got a _Transfer Object_ `PersonTO` that represents a person in our domain. We want to create a TestBuilder for this class to easily configure in our Unit Tests.

TestBuilders also typically reside under the same package as the class you want to build, but in the _test_ folder structure.

In IntelliJ, you can create a Unit Test for a class by pressing ![Windows](icons/glyph-windows-20.png)`ctrl+shift+t` from the class you're in.

Let's use this to our advantage for creating a TestBuilder, so open `PersonTO` with ![Windows](icons/glyph-windows-20.png)`ctrl+n`, and press ![Windows](icons/glyph-windows-20.png)`ctrl+shift+t`.

Overwrite the class name from `PersonTOTest` to `PersonTOTestBuilder` and press `Enter`.

You might want to get rid of unnecessary `org.junit.Assert.*` imports by pressing ![Windows](icons/glyph-windows-20.png)`ctrl+alt+o` to _Organize Imports_.

Go back ![Windows](icons/glyph-windows-20.png)`ctrl+alt+left` to the `PersonTO`, and copy all privates over to the TestBuilder.

Create an empty constructor for the TestBuilder with ![Windows](icons/glyph-windows-20.png)`alt+insert`. Press `up` and ![Windows](icons/glyph-windows-20.png)`ctrl+enter` to choose an empty constructor from the generation menu.

Create a `build` method that returns a `PersonTO`.

Then, still inside the `PersonTOTestBuilder`, generate setters for all the privates you just copied from `PersonTO`:

Press ![Windows](icons/glyph-windows-20.png)`alt+insert`, select `Setters`, press ![Windows](icons/glyph-windows-20.png)`shift+end` to select all the fields, and press ![Windows](icons/glyph-windows-20.png)`ctrl+Enter`.

`Enter` would also work, but it's better to ![Windows](icons/glyph-windows-20.png)`ctrl+Enter` when in a separate window, to press the highlighted button, and perform the _Default action_. And add this to muscle memory.

Now we've got a bunch of setters... That's great, but we want configurable methods on our builder instead.

Select `void set` of the first setter, and press ![Windows](icons/glyph-windows-20.png)`ctrl+alt+shift+j`.

Type `PersonTOTestBuilder` (because we want a _Fluent API_).

Now we've got some options with our method names. You either want all your configurable methods to have the `with` keyword, or you want them lowercased.

You can lowercase all your methods by selecting the first letter: from your multicursors position press ![Windows](icons/glyph-windows-20.png)`shift+right`. Then press ![Windows](icons/glyph-windows-20.png)`ctrl+shift+u` to toggle lower or upper case.

Now the only thing we need to do is return `this`. So press `down`, then press ![Windows](icons/glyph-windows-20.png)`shift+enter` (instead of ![Windows](icons/glyph-windows-20.png)`end`,`enter`), and type `return this;`

There you go, TestBuilder in under a minute.

### Testing Enum Lists
We've got a made up `Status` enum containing a bunch of statuses that contain another made up `SubStatus`.

In its Unit Test `StatusTest` we want to test that the static methods return the correct `Statuses` based on their `SubStatus`.

The implementation is already there, we just need a good list summation in our `.containsOnly` of the `NOT_REALLY` test.

Let's try using multicursors to get a list we can use.

Open `Status`, use ![Windows](icons/glyph-windows-20.png)`alt+j` on `NOT_REALLY` until you've got cursors on all the enums with that status.

Then try to select the Statuses themselves. Hint: You might have to disable `CamelHumps` with ![Windows](icons/glyph-windows-20.png)`ctrl+shift+a` to help with the selection.

Copy ![Windows](icons/glyph-windows-20.png)`ctrl+c` these.

Now navigate back to `StatusTest` and before you paste, enable _Column Mode_, make sure there's a bunch of empty lines and paste.

_Column Mode_ allows your multiple cursors to remain after pasting.

So with our multicursors still there, put a `,` behind every copied enum, and press ![Windows](icons/glyph-windows-20.png)`ctrl+shift+j` to join all the lines.

Complete the `yaReallyStatuses_ContainOnlyDoneAndDunno` test on your own. Hint: ![Windows](icons/glyph-windows-20.png)`alt+insert` is context sensitive, meaning IntelliJ will know what you want because you're in a Unit Test.

### Making csv lists from XML
Here's an excerpt of our xml containing a bunch of people from DC's Batman.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<Persons>
    <Person>
        <FirstName>Bruce</FirstName>
        <LastName>Wayne</LastName>
        <Age>24</Age>
        <SecretIdentity>Batman</SecretIdentity>
    </Person>
    <Person>
        <FirstName>Pamela Lillian</FirstName>
        <LastName>Isley</LastName>
        <Age>26</Age>
        <SecretIdentity>Poison Ivy</SecretIdentity>
    </Person>
    <Person>
        <FirstName>Edward</FirstName>
        <LastName>Nigma</LastName>
        <Age>41</Age>
        <SecretIdentity>The Riddler</SecretIdentity>
    </Person>
</Persons>
```
We'll try and create a csv list from this xml.

So let's open (![Windows](icons/glyph-windows-20.png)`ctrl+shift+n`) `Batman.xml`, and navigate to the directory where it's at with ![Windows](icons/glyph-windows-20.png)`ctrl+F1`.

Create a new file with ![Windows](icons/glyph-windows-20.png)`alt+insert` and call it `persons.csv`.

Copy the contents of `Batman.xml` into `persons.csv`. We can delete the first line already with ![Windows](icons/glyph-windows-20.png)`ctrl+y`.

We know that every `</` denotes the end of one field, but if we would ![Windows](icons/glyph-windows-20.png)`ctrl+alt+shift+j` on that, we would also include the `</Person>` tags.

These tags though, denote the end of one line, so let's first get rid of those and replace them with simple `new lines`. That means we can simply get rid of the start tag `<Person>` with ![Windows](icons/glyph-windows-20.png)`ctrl+y`.

Your file should now only contain items like this:
```
        <FirstName>Bruce</FirstName>
        <LastName>Wayne</LastName>
        <Age>24</Age>
        <SecretIdentity>Batman</SecretIdentity>

```

Select all the closing tags by selecting `</` and ![Windows](icons/glyph-windows-20.png)`ctrl+alt+shift+j`, and replace them by a `,`.

Your file should now only contain items like this:
```
        <FirstName>Bruce,
        <LastName>Wayne,
        <Age>24,
        <SecretIdentity>Batman,

```
If you want to retain the tag names as a CSV header line you can ![Windows](icons/glyph-windows-20.png)`alt+j` on the opening angular brackets and ![Windows](icons/glyph-windows-20.png)`ctrl+w` to select all tag names.

Paste them at the top (`home`) while in _Column Mode_ to retain the multicursors, at the ![Windows](icons/glyph-windows-20.png)`end` of the line put a `,` and ![Windows](icons/glyph-windows-20.png)`ctrl+shift+j`oin lines.

Then select all the opening tags by selecting `<` and ![Windows](icons/glyph-windows-20.png)`ctrl+alt+shift+j`.

Expand selection with ![Windows](icons/glyph-windows-20.png)`ctrl+w`, delete the tags, ![Windows](icons/glyph-windows-20.png)`ctrl+shift+j`oin lines and remove the last `,` at the ![Windows](icons/glyph-windows-20.png)`end` of the line. You can then still get rid of excess new lines by pressing `up` and either ![Windows](icons/glyph-windows-20.png)`ctrl+shift+j`oin lines or ![Windows](icons/glyph-windows-20.png)`ctrl+y` delete line.

And that's it.

[_Back to outline_](outline.md)