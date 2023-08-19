# Chapter 1 - Basics
[_Back to outline_](outline.md)

In this section, we will cover the basics of IntelliJ IDEA hotkeys, including general purpose commands such as copying and pasting, as well as using
built-in IDE helper functionalities. By mastering these fundamental shortcuts, you will be able to perform common tasks more efficiently, allowing
you to focus on your work and become more productive.

We recommend that you follow along with each exercise in this section to reinforce your understanding of the hotkeys and improve your muscle memory.
Whether you are a seasoned developer or just starting with IntelliJ IDEA, this tutorial series will help you become more proficient and productive.
So let's get to it!

## ![Mac](./icons/glyph-apple-32.png) <kbd>&#8984;</kbd> + <kbd>c</kbd>, <kbd>&#8984;</kbd> + <kbd>v</kbd>
To copy text on a Mac, select the text you want to copy using your mouse or keyboard, then press ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>C</kbd>. To paste the
copied text, move your cursor to the desired location and press ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>V</kbd>.

In this exercise, we will create a new constructor for `Chapter1` without the number parameter, and initialize the number field to the default value
of `0`. Copy the existing `Chapter1` constructor by selecting the text using your mouse, then press ![Mac](./icons/glyph-apple-20.png)<kbd>ctrl</kbd> + <kbd>C</kbd>. Move your cursor to
a new line below the constructor, then press ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>V</kbd> to paste the copied text. Remove the number parameter from the newly
created constructor, and initialize the number field to `0`.

## Keep your hands on your keyboard
Do the same exercise, but **ONLY** use your keyboard to select text.

## How to look up any actions' shortcut ![Mac](./icons/glyph-apple-32.png) <kbd>&#8984;</kbd>+<kbd>shift</kbd>+<kbd>a</kbd>, <kbd>double shift</kbd>
Repeat the previous exercise, but instead of using ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>C</kbd> / <kbd>&#8984;</kbd> + 
<kbd>V</kbd>, use ![Mac](./icons/glyph-apple-20.png) <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>a</kbd> to open the "Find Action" dialog. Type in the name of the action you want to perform, and IntelliJ IDEA will show you the shortcut associated with that action. Alternatively, you can double-tab the <kbd>shift</kbd> key to open the quick action menu and search for the 
action you want to perform. Use this method to look up the `copy` and `paste` actions, so you get a feel for using the dialog.

## IntelliJ's _Productivity Guide_

Open IntelliJ's Productivity Guide using these key combinations:
First press![Mac](./icons/glyph-apple-20.png) <kbd>&#8963;</kbd> + <kbd>F2</kbd> to focus on the taskbar, then use the arrow keys to navigate to the Help menu, then press down to
expand the menu itself, then press <kbd>enter</kbd> to select _My Productivity_.

**bonus:** Try opening the Productivity Guide using ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>a</kbd>, then type in "Productivity Guide" in the
search bar.

## Indenting, formatting with ![Mac](./icons/glyph-apple-32.png)`tab`, ![Mac](./icons/glyph-apple-32.png)<kbd>&#8963;</kbd> +<kbd> &#8997;</kbd> + <kbd>l</kbd>
Open `Fugly.java`, use selection and indent the test builder patterns properly.
For this exercise, you can use <kbd>shift</kbd> and your arrow keys to select lines.
Use <kbd>&#8677;</kbd> to indent them manually, or use ![Mac](./icons/glyph-apple-20.png)<kbd>&#8963;</kbd> + <kbd>&#8997;</kbd> + <kbd>l</kbd> 
to automatically format the selected
lines.

Hint: When manually indenting, first use ![Mac](./icons/glyph-apple-20.png)<kbd>shift</kbd> + <kbd>&#8677;</kbd> to unindent everything until the entire selection is against the left
side, then <kbd>&#8677;</kbd> the entire selection into its first indentation, decrease your selection and <kbd>&#8677;</kbd> that into its second
indentation. Rinse and repeat.

## Auto-indent with ![Mac](./icons/glyph-apple-32.png) <kbd>&#8963;</kbd> + <kbd>&#8997;</kbd> + <kbd>l</kbd>
You can use this combination on specific lines, as well on entire files.
Open FuglyToo.java, select a couple of lines starting with the `.withFace(face()` line and press <kbd>&#8963;</kbd> + <kbd>&#8997;</kbd> + <kbd>l</kbd>.
Now empty your selection (select nothing), and press <kbd>&#8963;</kbd> + <kbd>&#8997;</kbd> + <kbd>l</kbd> again.

## Undo, Redo ![Windows](./icons/glyph-apple-32.png) <kbd>ctrl</kbd> + <kbd>z</kbd>

The default `undo` and `redo` keyboard shortcuts on MacOS work the same over most applications. The weird behavior described in the windows section is
not relevant for Mac users. Use ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>z</kbd> to undo, and <kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>z</kbd> to redo.
  

[_Next Chapter_](chapter2.md)  

[_Back to outline_](outline.md)