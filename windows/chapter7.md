# Chapter 7 - Finding/Buffer
[_Back to outline_](outline.md)

Even though this is a very short chapter, I thought it valuable as it helps to introduce the next chapter on multi-cursors a
little bit better.

## Find word and add to buffer ![Windows](icons/glyph-windows-32.png)`ctrl+F3`
Let's open `WOTW.md` by pressing <kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>n</kbd> and look for the word _"Martians"_ in the first sentence.

Select this word by pressing <kbd>ctrl</kbd> + <kbd>w</kbd>, then press <kbd>ctrl</kbd> + <kbd>F3</kbd> once.
Now the word _"Martians"_ has been added to our _Find Buffer_. We can easily find the next occurrence of this word by pressing <kbd>F3</kbd>.

## Find next/previous occurrence from buffer ![Windows](icons/glyph-windows-32.png)`F3`/`shift+F3`

See what happens when you keep on pressing <kbd>F3</kbd>. If all goes well, your cursor should start iterating through all occurrences of the
selected word. Conversely, using <kbd>shift</kbd> + <kbd>F3</kbd> allows you to backtrack through the usages (aka. "find previous")

Now open `War.java`, position your cursor on `13:33` (line number 13, character number 13) using <kbd>ctrl</kbd> + <kbd>g</kbd>. Next, select
the `.` and press <kbd>ctrl</kbd> + <kbd>F3</kbd>.

**Exercise:** Find the next `.`.

---
  

[_Next Chapter_](chapter8.md)  

[_Back to outline_](outline.md)