# 🌐 Local Community Event Portal

A lightweight, browser-based portal developed using **HTML5, CSS3, and JavaScript** to help local residents register for events, view event galleries, give feedback, and more — all within the browser, without requiring backend setup.

## 📌 Project Overview

This portal is a mini-project based on HTML5 learning exercises designed to demonstrate semantic HTML, DOM interactions, styling, local storage, geolocation, and media elements.

---

## 🛠️ Features Included

### ✅ 1. HTML5 Base Template
- Semantic structure using `<!DOCTYPE html>`, `<html lang="en">`, and `<meta charset="UTF-8">`
- Sections with comments: Navigation, Main, Footer

### ✅ 2. Navigation and Linking
- Navigation bar linking to Home, Events, and Contact
- Internal page anchor links and external help page (`help.html`)

### ✅ 3. Welcome Banner & Styling
- Custom welcome banner with `id="welcomeBanner"`
- Inline and internal CSS styles applied
- `.highlight` class for emphasis

### ✅ 4. Image Gallery
- Event image gallery using `<table>` layout (2x3 grid)
- Proper usage of `alt`, `title`, and `class` for styling
- Captions included

### ✅ 5. Event Registration Form
- Form fields with `autofocus`, `placeholder`, and `required`
- Live confirmation message using `<output>`
- Styled with CSS

### ✅ 6. Event Feedback & Event Handling
- JavaScript events:
  - `onblur` for phone validation
  - `onchange` for event fee display
  - `onclick`, `ondblclick`, and `onkeydown` for interactivity
- Real-time feedback character count

### ✅ 7. Event Video Invite
- Embedded `<video>` with `oncanplay` event
- Displays "Video ready!" when playable
- Warns users before navigating away using `onbeforeunload`

### ✅ 8. Saving User Preferences
- `localStorage` used to save selected event type
- Auto pre-selection on page reload
- "Clear Preferences" button clears storage

### ✅ 9. Geolocation for Events
- Finds user's location with `getCurrentPosition()`
- Handles errors like timeout and denied access
- High-accuracy option enabled

### ✅ 10. Debugging (DevTools)
- Comments guide how to:
  - Use Chrome DevTools for layout fixes
  - View console logs
  - Set JS breakpoints

---

## 🧰 Technologies Used

- **HTML5**
- **CSS3**
- **JavaScript (ES6)**
- Git & GitHub for version control  
- Chrome DevTools for debugging

---

## 📁 Files in the Repository

| File Name        | Description                           |
|------------------|---------------------------------------|
| `index.html`     | Main page of the event portal         |
| `help.html`      | External help/information page        |
| `README.md`      | This documentation                    |

---

## 🚀 How to Run

1. Clone this repo:
   ```bash
   git clone https://github.com/Varshitha-debug/Module-1-HTML.git
