# Chapter 6 - IntelliJ's Suggestions
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

Try it out again to construct `Optimus`' nemesis, `Galvatron`.

### Autocomplete selection confirmation
After you used `ctrl+shift+space` or `ctrl+space`, confirming your selection can be done in multiple ways.

* Pressing `Enter` straight up completes the code.
* Pressing `Tab` replaces code that was there before.
* Pressing `.` completes the code and suffixes a `.` so you can continu typing
* Pressing `space` does the same but suffixes with a `space`. (this is different from regular suggestion after typing a `.`!)

## _QuickFix_ (:bulb:) `alt+enter`
_QuickFix_ is magical. It's your go to shortcut for almost everything. Creating a new constructor? `alt+enter`. Extracting a method out of selected code? `alt+enter`. Extracting a variable? `alt+enter`. Code not compiling? `alt+enter`. Cure cancer? `alt+enter`. The list goes on and on.

So really, if there's one shortcut you should remember it's this one.

Let's try it out on some stuff.



## Creating _stuff_ `alt+ins`

## Deleting _stuff_ `alt+del`

## View JavaDoc `ctrl+q`

## View parameters `ctrl+p`
