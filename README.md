# km-miles-converter
Android App

Trying out [Coursera's Build Your First Android App (Project-Centered Course) by CentraleSupélec](https://www.coursera.org/learn/android-app/home/welcome) :D

Found this free certified course from [this list of free certified coursera courses.](https://www.freecodecamp.org/news/coronavirus-coursera-free-certificate/)

This app is part of Week 2's assignment.

## How this app is different from the demo

Refactor

1. Magic number for miles per km: `0.621371` is moved to a Constant file. Improvement on Reusability and Readability.

2. `findViewId()` for inputs are moved outside the button click handlers. UI references for inputs only need to be assigned once, and this change avoids redundant reassignment each time button is clicked. Slight improvement on performance?

3. Logic for conversion is moved to a `ConversionService` class, so that the conversion logic can be unit tested. Improvement on Testability.

Error Handling

1. Toast reminder to enter valid input if input to be converted is invalid (eg. blank).

UI

1. Restrict km and miles input type to decimal number.

```
android:inputType="numberDecimal"
```

Testing

1. Added Unit Tests.