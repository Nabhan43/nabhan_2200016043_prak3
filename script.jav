let isDarkMode = false;
let currentFontSize = 16;

function addTask() {
    const taskInput = document.getElementById("newTask");
    const taskList = document.getElementById("taskList");

    if (taskInput.value.trim() !== "") {
        const listItem = document.createElement("li");
        listItem.textContent = taskInput.value;

        const deleteButton = document.createElement("button");
        deleteButton.textContent = "close";
        deleteButton.classList.add("close");
        deleteButton.onclick = function() {
            deleteTask(listItem);
        };

        listItem.appendChild(deleteButton);
        taskList.appendChild(listItem);

        taskInput.value = "";
    } else {
        alert("Masukkan tugas mu terlebih dahulu");
    }
}

function deleteTask(taskItem) {
    taskItem.remove();
}

function changeBackgroundColor() {
    const colorSelector = document.getElementById('colorSelector');
    const selectedColor = colorSelector.value;
    document.body.style.backgroundColor = selectedColor;
}

function increaseFontSize() {
    currentFontSize += 2;
    document.body.style.fontSize = currentFontSize + 'px';
}

function decreaseFontSize() {
    currentFontSize = Math.max(10, currentFontSize - 2);
    document.body.style.fontSize = currentFontSize + 'px';
}

function toggleDarkMode() {
    isDarkMode = !isDarkMode;
    document.body.classList.toggle('dark-mode', isDarkMode);
}

function changeFontStyle() {
    const fontSelect = document.getElementById('fontchange');
    const selectedFont = fontSelect.value;
    document.body.style.fontFamily = selectedFont;
    fontSelect.style.fontFamily = selectedFont;

    const buttons = document.querySelectorAll('.tombol-tampilan button');
    buttons.forEach(button => {
        button.style.fontFamily = selectedFont;
    });
}
