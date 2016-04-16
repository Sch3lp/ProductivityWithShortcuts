# Chapter 2 - Navigation

## Word-skipping `ctrl+arrows`
Open Chapter2.java, place your cursor in front of the `The` of the popular phrase, and tap `ctrl+right` 8 times.

You should now have your cursor at the beginning of the word `camel`.

## Begin/End of Line `home`, `end`
Still in Chapter2.java, place your cursor at the start of the popular phrase, and do `end`.
Press `home` once, look at your position, then press `home` again and see what happens.
Press `home` one more time and again look at what happens.

If you wanna see a stroboscope effect, put your cursor at the beginning of the word `return`, hold down `shift+home`. ;)

## Begin/End of File `ctrl+home`, `ctrl+end`
Try out `ctrl+home` and `ctrl+end` in Chapter2.java.

## CamelHumps (+ how to toggle)
In Chapter2.java, put your cursor at the beginning of the method `theQuickBrownFoxJumpedOverTheLazyCamel`.

Try to use _Skip Word_ with `ctrl+right` on that method.

Depending on your CamelHumps setting, your cursor either ended up on the `Q` or it skipped the entire method name and you ended up on the `(`.

Return to the beginning of the method name and press `ctrl+shift+a`, then type `CamelHump`. There should be a setting `Smart Keys: Use "CamelHumps" words` with a toggle button.

Navigate to that option and select it by pressing `Enter`, then press `Escape` to cancel out of the action menu.

Try to use _Skip Word_ again with `ctrl+right`.

Other tools, like SublimeText, have different key combination to skip the entire word (`ctrl+right`), or skip based on CamelCasing (`alt+right`).

## Jumping methods (`alt+up,down`)
Put your cursor at the `theQuickBrownFoxJumpedOverTheLazyCamel` method.

Keep pressing `alt+down` and see what happens.

Keep pressing `alt+up` and see what happens.

## Jump to "error" `F2`
Move to the top of the file with `ctrl+Home` and from there press `F2`.

This should navigate your cursor to the class name `Chapter2` because IntelliJ marks it as _unused_.

If you keep pressing `F2` it should keep cycling your cursor over the _unused warnings_.

In between the methods `jump()` and `camel()`, paste the following:

```
privet String kakdilla() {
    "horocho";
}
```

Move to the top of the file again, and press `F2` once again.

Notice how the cursor now first jumps to the actual compilation error (`privet` cannot be resolved).

Cycling also happens only over all the actual _errors_, and _unused warnings_ are not cycled anymore.

## Jump to last edit position `ctrl+shift+backspace`

## Jump into `ctrl(+alt)+b`

## History and its importance `ctrl+alt+left,right`

## Show in Project `alt+F1`

## Jump to line `ctrl+g` (example with paste from stacktrace)

## Navigate to method `ctrl+F12` (example with paste from stacktrace and quick check equals impl)

## `alt+F7` vs. `ctrl+alt+h`
