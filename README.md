# Chapter 1 - Basics

## crl+c, ctrl+v
Copy the Chapter1 constructor to create a new one without a number, have the default number be 0.

Use your mouse to select text, then press `ctrl+c` to copy the selected text.

Use your mouse to move your cursor to somewhere else, then press `ctrl+v` to paste the selected text.

## Keep your hands on your keyboard
Do the same exercise, but **ONLY** use your keyboard to select text.

## How to look up any actions' shortcut `ctrl+shift+a`, `double shift`
Repeat Exercise 1, but instead of ctrl+c and ctrl+v, use ctrl+shift+a to look up your copy and paste actions

## IntelliJ's _Productivity Guide_
Open IntelliJ's Productivity Guide using these key combinations:
First press `alt+h` for _(H)elp_ (in the taskbar), then press `p` to select _(P)roductivity Guide_.

## Bonus
Try opening the Productivity Guide using `ctrl+shift+a`.

## Indenting, formatting with `tab`, `shift+tab`
Open Fugly.java, use selection and indent the test builder patterns properly.

Hint: First `shift+tab` everything until the entire selection is against the left side, then `tab` the entire selection into its first indentation, decrease your selection and `tab` that into its second indentation. Rinse and repeat.

## Auto-indent with `ctrl+alt+l`
Open FuglyToo.java, select a couple of lines starting with the `.withFace(face()` line and press `ctrl+alt+l`.

Now empty your selection (select nothing), and press `ctrl+alt+l` again.

## Undo, Redo `ctrl+z` and `ctrl+shift+z`
In most editors, Redo is mapped to `ctrl+y`. Not in IntelliJ. This can lead to hilarious (or super annoying) situations where you'll lose your _undo buffer_.

Let's try it out and see what happens so you'll remember it better.

Open FuglyToo.java once more.

Add a comment above the method that reads `// this method is fugly`.

Add a comment on a new line that reads `// such fugliness should never be allowed`.

Press `ctrl+z` (_Undo_) and see what happens.

Press it a couple times.

Now press `ctrl+shift+z` (_Redo_) and see what happens.

Add three comments each on a different line:
```
// herpty
// derpty
// derp
```
After you've typed the last line, press `ctrl+z` until you only have `// herpty` left.

As most people will have the reflex to press `ctrl+y` to _Redo_ their work, let's see what happens when we do just that.

So try `ctrl+y`, then try `ctrl+shift+z` like you meant to do.

Try `ctrl+z` and see what that does. Try `ctrl+shift+z` again now.

Keep this in mind when you work in IntelliJ, or in another editor that doesn't have `ctrl+y` for _Redo_ :)