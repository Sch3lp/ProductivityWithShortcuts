# Chapter 6 - IntelliJ's Suggestions
[_Back to outline_](outline.md)
## IntelliJ's Auto-correct `ctrl+shift+enter`
Sometimes we make mistakes, mistakes that will take us into the deepest pits of bracket hell.

Thank God there's IntelliJ, trying to auto-correct our mistakes.

Let's open (`ctrl+n`) `Chapter6.java`, a class with many mistakes (and (a hell of (a lot of)) brackets).

Let's see what IntelliJ can do for us to fix the mistakes by pressing `F2` to navigate quickly to the first error, and press `ctrl+shift+enter`.

Press `F2` again and let's see if IntelliJ can auto-fill the missing semicolon.

Press `F2` again and see if it can auto-correct an incomplete method.

Undo (`ctrl+z`) your last auto-correct and type out `public void poo(` above the comment line.

It's basically the same thing we tried to auto-correct just a few seconds ago. The only difference is that there are now two "incomplete" error statements.

Try pressing `ctrl+shift+enter` anyways and see what happens.

## Autocomplete `ctrl+space` vs. `ctrl+shift+space`
Open `Transformers.java`. Try to autocomplete the constructor of our old friend `optimus`. (Hint: `F2` to quickly navigate to the missing constructor argument)

First try pressing `ctrl+space` to have IntelliJ give you an autocomplete suggestion. You'll notice that eventhough the constructor only expects an `AutobotEnum`, IntelliJ still suggest a bunch of other stuff like `new`, `null`, `equals()`, etc.

`Escape` out of the suggestion window and let's try the alternative `ctrl+shift+space`. This makes IntelliJ way more helpful.

Before selecting one of the `AutobotEnum` suggestions, try pressing `ctrl+shift+space` again.

That's right, there's a static method `Autobot.optimusEnum()` that also returns an `AutobotEnum`, IntelliJ knows about this method as well.

Try it out again to construct `Optimus`' nemesis, `Megatron`.

### Autocomplete selection confirmation
After you used `ctrl+shift+space` or `ctrl+space`, confirming your selection can be done in multiple ways.

* Pressing `Enter` straight up completes the code.
* Pressing `Tab` replaces code that was there before.
* Pressing `.` completes the code and suffixes a `.` so you can continu typing
* Pressing `space` does the same but suffixes with a `space`. (this is different from regular suggestion after typing a `.`!)

Right now `Optimus` has a `.catchphrase` method that takes a prefix. Since it's always _\<prefix\> Rollout!_ we can rename that method to `rollout`.

Let's _navigate_ to the `.catchphrase` method with `ctrl+alt+b`. Then simply delete `catchphrase` and replace it with `rollout` (don't use `shift+F6`).

Then go back to the `Transformers` class with `ctrl+alt+left`, and autocomplete to use the new `rollout` method instead of the previous, non-compiling `catchPhrase` method. First try using `Enter` as your selection confirmation, see what happens. Then undo with `ctrl+z`, retry autocompletion and use `Tab` as your selection confirmation.

Rinse and repeat with the other ways listed above.

## _QuickFix_ (:bulb:) `alt+enter`
_QuickFix_ is magical. It's your go to shortcut for almost everything.

Creating a new constructor? `alt+enter`

Creating getters (and setters) for newly created fields? `alt+enter`

Extracting a method out of selected code? `alt+enter`

Extracting a variable? `alt+enter`

Code not compiling? `alt+enter`

Cure cancer? `alt+enter`

The list goes on and on.

So really, if there's one shortcut you should remember it's this one.

## Creating _stuff_ `alt+insert`
Try out these things using `alt+insert`:
* Create a new package from the `1: Project` _Tool Window_ to create a new class in the next step.
* Create a new class from the `1: Project` _Tool Window_.
* Create a new constructor in that class from the editor.

## Deleting _stuff_ `alt+delete`
Let's delete all the stuff we created in the previous step using `alt+delete`.
* Delete the constructor you just created
* Delete the class you just created (the package will probably be deleted automatically because it was the only class in there)

## View JavaDoc `ctrl+q`
Open `Transformers.java`, and move your cursor to `Autobot`.

Press `ctrl+q` to view the JavaDoc of the `Autobot` class. `Escape` out of this window.

Press `ctrl+q` twice to get a bigger (and separate) window. Notice that you can not simply `Escape` out of this separate window. You can however close it by pressing `ctrl+q` one more time and then `Escape` out of it.

`ctrl+q` is also available from inside the autocompletion suggestion box. Try to call `.toString()` after your `new Autobot()` statement while using autocompletion (either by typing `.` or by `ctrl+space`'ing).

While still in the autocompletion suggestion, navigate to the `.toString()` option and press `ctrl+q` to read the JavaDoc.

## View parameters `ctrl+p`
Not sure what parameters a method you're trying to use takes? Press `ctrl+p` while in the brackets of a method call and check what parameters you need.

In `Transformers.java`, let's try to create the _StarScream Decepticon_.

First uncomment the `// Decepticon.StarScream()` line.

Then put your cursor in between the brackets and type `ctrl+p`.

Notice how IntelliJ signals which parameter you're required to fill in by **emboldening** the parameter name.

[_Back to outline_](outline.md)