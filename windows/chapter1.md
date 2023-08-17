# Chapter 1 - Basics
[_Back to outline_](outline.md)

In this section, we will cover the basics of IntelliJ IDEA hotkeys, including general purpose commands such as copying and pasting, as well as using
built-in IDE helper functionalities. By mastering these fundamental shortcuts, you will be able to perform common tasks more efficiently, allowing
you to focus on your work and become more productive.

We recommend that you follow along with each exercise in this section to reinforce your understanding of the hotkeys and improve your muscle memory.
Whether you are a seasoned developer or just starting with IntelliJ IDEA, this tutorial series will help you become more proficient and productive.
So let's get to it!

## ![Windows](icons/glyph-windows-32.png)ctrl+c, ctrl+v
To copy text, select the text you want to copy using your mouse or keyboard, then press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>C</kbd>. To paste the copied text,
move your cursor to the desired location and press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>V</kbd>.

In this exercise, we will create a new constructor for `Chapter1` without the number parameter, and initialize the number field to the default value
of `0`. Copy the existing `Chapter1` constructor by selecting the text using your mouse, then press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>C</kbd>. Move your cursor to
a new line below the constructor, then press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>V</kbd> to paste the copied text. Remove the number parameter from the newly
created constructor, and initialize the number field to `0`.

## Keep your hands on your keyboard
Do the same exercise, but **ONLY** use your keyboard to select text.

## How to look up any actions' shortcut ![Windows](icons/glyph-windows-32.png)`ctrl+shift+a`, `double shift`
Repeat the previous exercise, but instead of using ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>C</kbd> / ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>V</kbd>, use ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>
shift</kbd> + <kbd>a</kbd> to open the "Find Action" dialog. Type in the name of the action you want to perform, and IntelliJ IDEA will show you the
shortcut associated with that action. Alternatively, you can double-tab the <kbd>shift</kbd> key to open the quick action menu and search for the
action you want to perform. Use this method to look up the `copy` and `paste` actions, so you get a feel for using the dialog.

## IntelliJ's _Productivity Guide_

Open IntelliJ's Productivity Guide using these key combinations:
First press ![Windows](icons/glyph-windows-20.png)<kbd>alt</kbd> + <kbd>h</kbd> for _(H)elp_ (in the taskbar), then press <kbd>P</kbd> to select _(P)roductivity Guide_.

**bonus:** Try opening the Productivity Guide using ![Windows](icons/glyph-windows-20.png)<kbd>Ctrl</kbd> + <kbd>Shift</kbd> + <kbd>A</kbd>, then type in "Productivity Guide" in the
search bar.

## Indenting, formatting with ![Windows](icons/glyph-windows-20.png)`tab`, `shift+tab`
Open `Fugly.java`, use selection and indent the test builder patterns properly.
For this exercise, you can use <kbd>shift</kbd> and your arrow keys to select lines.
Use <kbd>Tab</kbd> to indent them manually, or use ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>alt</kbd> + <kbd>l</kbd> to automatically format the selected lines.

Hint: When manually indenting, first use ![Windows](icons/glyph-windows-20.png)<kbd>shift</kbd> + <kbd>Tab</kbd> to unindent everything until the entire selection is against the left
side, then <kbd>Tab</kbd> the entire selection into its first indentation, decrease your selection and <kbd>Tab</kbd>  that into its second
indentation. Rinse and repeat.

## Auto-indent with ![Windows](icons/glyph-windows-20.png)`ctrl+alt+l`
You can use this combination on specific lines, as well on entire files.
Open FuglyToo.java, select a couple of lines starting with the `.withFace(face()` line and press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>alt</kbd> + <kbd>l</kbd>.
Now empty your selection (select nothing), and press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>alt</kbd> + <kbd>l</kbd> again.

## Undo, Redo ![Windows](icons/glyph-windows-20.png)`ctrl+z` and ![Windows](icons/glyph-windows-20.png)`ctrl+shift+z`

In most editors, `Redo` is mapped to ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>y</kbd>. Not so in IntelliJ.  
This can lead to hilarious (or super annoying) situations where you'll lose your _undo buffer_.

Let's try it out and see what happens so you'll remember it better.
Open `FuglyToo.java` once more.
Add a comment above the method that reads `// this method is fugly`.
Add a comment on a new line that reads `// such fugliness should never be allowed`.
Press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>z</kbd> (_Undo_) and see what happens.

Press it a couple of times.

Now press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>z</kbd> (_Redo_) and see what happens.
Add these three comments to the file, each starting on a different line:

```
// herpty
// derpty
// derp
```

After you've typed the last line, press  ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>z</kbd> until you only have `// herpty` left.

As most people will have the reflex to press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>y</kbd> to _Redo_ their work, let's see what happens when we do just that.
Use ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>y</kbd>, then try ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>z</kbd> to attempt and redo the revert you wish to reapply.

Try ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>z</kbd> and see what that does. Try ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>z</kbd> again now.

Keep this strange behavior in mind when you work in IntelliJ, or in another editor that doesn't have ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>y</kbd> for _Redo_ :)


[_Next Chapter_](chapter2.md)  
[_Back to outline_](outline.md)