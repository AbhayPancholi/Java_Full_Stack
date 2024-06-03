<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Upload Image</title>
    <link rel="stylesheet" type="text/css" href="CSS/Upload.css">
    <script>
        function previewImage(event) {
            const reader = new FileReader();
            reader.onload = function(){
                const output = document.getElementById('preview');
                output.src = reader.result;
                output.style.display = 'block';
            };
            reader.readAsDataURL(event.target.files[0]);
        }

        function allowDrop(event) {
            event.preventDefault();
        }

        function drop(event) {
            event.preventDefault();
            const files = event.dataTransfer.files;
            document.getElementById('imageInput').files = files;
            previewImage({target: {files: files}});
        }
    </script>
</head>
<body>
    <h2>Upload Image</h2>
    <form action="UploadImage" method="post" enctype="multipart/form-data">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" required>

        <label for="description">Description:</label>
        <textarea id="description" name="description" required></textarea>

        <label for="tags">Tags:</label>
        <input type="text" id="tags" name="tags">

        <label for="imageInput">Select Image:</label>
        <input type="file" id="imageInput" name="image" accept="image/*" onchange="previewImage(event)" required>

        <div id="dropZone" ondrop="drop(event)" ondragover="allowDrop(event)">
            <p>Drag and drop an image here</p>
        </div>

        <div>
            <img id="preview" src="#" alt="Image preview" style="max-width: 100%; display: none;">
        </div>

        <input type="submit" value="Upload">
    </form>
</body>
</html>
