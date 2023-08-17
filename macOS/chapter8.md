# Chapter 8 - Multiple Cursors
[_Back to outline_](outline.md)

And now, introducing the feature you have all been waiting for, the one and only:__Multiple Cursors__!

This is probably the most powerful, and useful, feature any text editor can have. Sadly enough, it might also be one of the most underused
features. Let's take a moment to compose ourselves, make sure we're wide awake for this chapter, and dive into the wonderful world of multi-line
editing.

## Toggle Column Mode ![Mac](./icons/glyph-apple-32.png)`alt+shift+insert`

### Part 1

For starters, let's introduce you to _Column Mode_.
Let's open `Chapter8`. The `output` variable contains a long string concatenation, but there are a few problems with it:

* the `+` is missing to actually DO the concatenation
* and there's a space missing at the end of every string

You could put your cursor at the beginning of the second line, type a `+`, and then press <kbd>&#8595;</kbd> and <kbd>&#8984;</kbd> + <kbd>&#8592;</kbd>,
and type a `+` again. Now you could repeat that process for every line, but there's an easier way.

Since all the strings are lined up perfectly, wouldn't it be easier if we could first put a bunch of cursors in front of every line, and then just
type `+`? Let's try to do just that.

First position your cursor at the **beginning** of the second string (`"one hell of a"`).
While watching the bottom right of your screen press <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>8</kbd> once.
You should see the word `Column` appear next to `UTF-8`. This means you have just toggled on `Column Mode`.

Now, hold down <kbd>shift</kbd> and press <kbd>&#8595;</kbd> until you've reached the last string (`"of column mode"`). There
should be a cursor blinking at the beginning of every line. It might look like one giant cursor, but it is in fact a bunch of them.

Now simply type a `+` and be amazed.

Exit out of your multi-cursors by pressing <kbd>Escape</kbd>. Exit out of _Column Mode_ by pressing <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>8</kbd> again.
The word `Column` should no longer appear in the bottom right, indicating you have indeed exited `column select mode`.

### Part 2
Let's undo our changes by pressing <kbd>&#8984;</kbd> + <kbd>Z</kbd> and take a different approach. Notice
how using <kbd>&#8984;</kbd> + <kbd>Z</kbd> once puts the multiple cursors back.

Now, what we really want is a `+` at the **end** of every string, and to add a space inside all the strings.
Here is how you could do that.

Instead of putting your cursor at the beginning of the second line, put it at the beginning of the **first** line (`"This sure is"`).

Toggle _Column Mode_ again with <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>8</kbd>, and select all the lines again by repeatedly
pressing <kbd>&#8595;</kbd> until you've reached the second to last string.

Now press <kbd>&#8984;</kbd> + <kbd>&#8594;</kbd> . Notice how the cursors are all at different ending positions.

First let's add the spaces so our strings aren't pressed together as much. Move your cursor inside of the string by pressing <kbd>&#8592;</kbd>
once. Then type a <kbd>space</kbd>.

Then press <kbd>End</kbd> again and type a <kbd>+</kbd>. <kbd>Escape</kbd> out of the multi-cursor and disable _Column Mode_ by
pressing <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>8</kbd>.

This is a great feature when all the lines you want to edit are directly underneath each other. However, that won't always be the case.
Let's take a look at how we can cope with those situations.

## ![Mac](./icons/glyph-apple-32.png)`alt+j`, ![Mac](./icons/glyph-apple-32.png)`alt+shift+j` and ![Mac](./icons/glyph-apple-32.png)`ctrl+alt+shift+j`

In `Chapter8` there are two methods that need some fixing. They both tried to use a `StringBuilder` but seemed to have forgotten to use
the `append()` method. We can't use _Column Mode_ because the same mistake is repeated in a different method and there are lines in between that we
don't want to put a cursor at.

We can, however, use <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd> to add a cursor to a _Find buffer_ (<kbd>F3</kbd> and <kbd>&#8963; ctrl</kbd> +
<kbd>F3</kbd>).  
Take a moment to think about what selection you would want to _Find_ in that class.
First, try and see what would be included by pressing <kbd>&#8984;</kbd> + <kbd>F3</kbd> on the following selections: `"`, `.`, `."`.

> [!TIP]
> Spoiler:
> - `"` won't be good, because then we'd also end up with a cursor at the end of the string.
> - `.` won't be good either, because we don't want to include the `.toString()`.
> - `."` however is a near perfect fit.

So let's select the first `."` at `21:17` and press <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd> once and see what happens.
Now repeat <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd> until you've selected all of the occurrences.
You'll notice that the last occurrence is working code, and we don't want to change that last one. So
press <kbd>&#8963; ctrl</kbd> + <kbd>shift</kbd> + <kbd>g</kbd> to undo that last `add to cursor` selection.

Then let's fix the code by typing `append` after the `.`. Don't exit out of your multi-cursor just yet.

Remember how in [Chapter 3](./chapter3.md) we learned about IntelliJ's _Wrapping_ feature?
Maybe you also recall how we said that it was gonna shine in this chapter?

If you haven't already, enable Wrapping with <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>A</kbd>, `smart braces`, `enter`.

From the multi-cursors positioned after the `append` you just typed, press <kbd>shift</kbd> + <<kbd>&#8984;</kbd> + <kbd>&#8595;</kbd> to select all the
strings, and then press `(`.

As an alternative to repeatedly pressing <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd>, and if you're 100% sure that you won't include too much, you
can also press <kbd>&#8984;</kbd> + <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd> and add **all** occurrences to your cursors in one go.

Undo <kbd>&#8984;</kbd> + <kbd>z</kbd> your corrections and try it out.

Notice how <kbd>&#8963; ctrl</kbd> + <kbd>shift</kbd> + <kbd>g</kbd> still deselects the last occurrence. This is
because <kbd>&#8984;</kbd> + <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd> is merely a repeated <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd>.

> **NOTE:**  
> Using this key combination often is also a great way to train your manual dexterity.

## Various use cases
Now that we've seen the basics of creating and using multiple cursors, let's try to apply it to some everyday tasks.
We will see how using multiple selections can make your developer life so much easier.

### Creating a TestBuilder
In IntelliJ, you can create a Unit Test for a class by pressing <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>t</kbd> from the class you're
currently editing.

We will now use this to our advantage while creating a TestBuilder. Open `PersonTO` with <kbd>&#8984;</kbd> + <kbd>o</kbd>, and
press <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>t</kbd>.

Overwrite the class name from `PersonTOTest` to `PersonTOTestBuilder` and press <kbd>Enter</kbd>.

You might want to get rid of unnecessary `org.junit.Assert.*` imports by pressing <kbd>&#8963; ctrl</kbd> + <kbd>&#8997;</kbd> + <kbd>o</kbd>
to _Organize Imports_.

Go back <kbd>&#8984;</kbd> + <kbd>[</kbd> to the `PersonTO`, and copy all private fields over to the `PersonTOTestBuilder`.

Create an empty constructor for the TestBuilder with <kbd>&#8984;</kbd> + <kbd>n</kbd>.
Press <kbd>&#8593;</kbd> and <kbd>ctrl</kbd> + <kbd>enter</kbd> to choose `empty constructor` from the generation menu.

Create a `build()` method that returns a `PersonTO`.

Now, while still inside the `PersonTOTestBuilder`, generate setters for all the private fields we just copied from `PersonTO`:
Press <kbd>&#8984;</kbd> + <kbd>n</kbd>, select `Setters`, then press <kbd>shift</kbd> + <kbd>&#8984;</kbd> + <kbd>&#8595;</kbd> to
select all the fields, and press <kbd>ctrl</kbd> + <kbd>Enter</kbd>.

Using <kbd>Enter</kbd> would also work, but it is advisable to use <kbd>ctrl</kbd> + <kbd>Enter</kbd> when in a separate window, to
press the highlighted button, and perform the _Default action_.

> **TIP:**  
> Commit this sequence to muscle memory, you will get good mileage from it.

Now we've got a bunch of setters in our builder... That's great, but we also want the methods to be chainable.

Select the "`void set`" part of the first setter, and press <kbd>&#8984;</kbd> + <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd>.
Type `PersonTOTestBuilder` (because we want a _Fluent API_, using chainable interfaces).

Now we've got some options with our method names. We either want all of our configurable methods to have the `with` prefix, or you want them
lowercased.

We can lowercase all of our methods by selecting the first letter: from your multi-cursors position
press <kbd>shift</kbd> + <kbd>&#8594;</kbd>. Then press <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>u</kbd> to toggle lower or upper
case.

Now the only thing we need to do is to change the return statement to: `return this;`.
Let's press <kbd>&#8595;</kbd>, then press <kbd>shift</kbd> + <kbd>enter</kbd>, and type `return this;`

There you go! We managed to create a TestBuilder in less than a minute of work.
Time to be pleased with ourselves and fetch a hot beverage.

### Testing Enum Lists

Open `Status.java`, and use <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd> on `NOT_REALLY` until you've got cursors on all the enums with that
status. Now try to select the Statuses themselves.

> **TIP:**  
> You might have to disable `CamelHumps` with <kbd>&#8984;</kbd> + <kbd>a</kbd> to help with the selection.

Copy (&#8984; + <kbd>c</kbd>) these.
Now navigate back to `StatusTest.java`. Before you paste, enable _Column Mode_ (<kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>8</kbd>), make sure there's a bunch of empty lines, and paste your
buffered lines to their destination.
By using _Column Mode_, we ensure our multiple cursors remain active and usable after pasting.

With our multi-cursors still there, put a `,` behind every copied enum value,
and press <kbd>&#8963; ctrl</kbd> + <kbd>shift</kbd> + <kbd>j</kbd> to join all the lines.

Now: complete the `yaReallyStatuses_ContainOnlyDoneAndDunno` test on your own.
> **TIP:**  
> <kbd>&#8984;</kbd> + <kbd>N</kbd> is context sensitive, meaning IntelliJ will know what you want because you're in a Unit Test.

### Making csv lists from XML
Here's an excerpt of an XML file containing a bunch of people from DC's Batman universe.

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

So let's open (<kbd>&#8984;</kbd> + <kbd>O</kbd>) `Batman.xml`, and navigate to the directory where it's at
with <kbd>&#8984;</kbd> + <kbd>1</kbd>.

Create a new file with <kbd>&#8984;</kbd> + <kbd>n</kbd> and call it `persons.csv`.

Copy the contents of `Batman.xml` into `persons.csv`. We can already delete the first line with <kbd>&#8984;</kbd> + <kbd>backspace</kbd>.

We know that every `</` denotes the end of one field, but if we were to use <kbd>&#8984;</kbd> + <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd> on
that, we would also include the `</Person>` tags.

These tags though, denote the end of one line, so let's first get rid of those and replace them with simple `new lines`.
This means we can simply get rid of the start tag `<Person>` with <kbd>&#8984;</kbd> + <kbd>backspace</kbd>.

Your file should now only contain items like this one:

```xml

<FirstName>Bruce</FirstName>
<LastName>Wayne</LastName>
<Age>24</Age>
<SecretIdentity>Batman</SecretIdentity>
```

Select all the closing tags by selecting `</` and <kbd>&#8984;</kbd> + <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd>, and replace them by a `,`.

Your file should now only contain items that look like this:

```xml

<FirstName>Bruce,
    <LastName>Wayne,
        <Age>24,
            <SecretIdentity>Batman,
```

We will now get rid of the opening tags, so we end up with a CSV-formatted file.

If you want to retain the tag names as a CSV header line you can <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd> on the opening angular brackets (`<`)
and <kbd>&#8997; Opt</kbd> + <kbd>&#8593;</kbd> to select all tag names.

Paste them at the top ( <kbd>&#8984;</kbd> + <kbd>&#8593;</kbd> ) while in _Column Mode_ to retain the multi-cursors, at the end (<kbd>&#8984;</kbd> + <kbd>&#8594;</kbd>) of the
line put a `,` and press <kbd>&#8963; ctrl</kbd> + <kbd>shift</kbd> + <kbd>j</kbd>. The `j` indicating we wish to join lines together.

Then select all the opening tags by selecting `<` and pressing  <kbd>&#8984;</kbd> + <kbd>&#8963; ctrl</kbd> + <kbd>g</kbd>.

Expand selection with <kbd>&#8997; Opt</kbd> + <kbd>&#8593;</kbd>, delete the tags, and join the lines together (<kbd>&#8963; ctrl</kbd> +
<kbd>shift</kbd> + <kbd>j</kbd>).
Now remove the last `,` at the end of the line. You can then still get rid of excess new lines by
pressing <kbd>&#8593;</kbd> and either <kbd>&#8963; ctrl</kbd> + <kbd>shift</kbd> + <kbd>j</kbd> or <kbd>&#8984;</kbd> + <kbd>backspace</kbd> delete
line.

And that's it.

---

[_Next Chapter_](chapter9.md)
[_Back to outline_](outline.md)