function validateStudentForm() {

    // Get form values
    const firstName = document.getElementById("firstName").value.trim();
    const lastName = document.getElementById("lastName").value.trim();
    const email = document.getElementById("email").value.trim();
    const dob = document.getElementById("dob").value;
    const admissionDate = document.getElementById("admissionDate").value;
    const city = document.getElementById("city").value.trim();
    const stateCode = document.getElementById("stateCode").value.trim();
    const country = document.getElementById("country").value.trim();

    // Firstname max 50
    if (firstName.length === 0 || firstName.length > 50) {
        alert("First name is required and must be max 50 characters");
        return false;
    }

    // Lastname max 50
    if (lastName.length > 50) {
        alert("Last name must be max 50 characters");
        return false;
    }

    // Email pattern
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!emailPattern.test(email)) {
        alert("Please enter a valid email address");
        return false;
    }

    // DOB not future & age >= 18
    if (dob === "") {
        alert("Date of Birth is required");
        return false;
    }

    const dobDate = new Date(dob);
    const today = new Date();

// No need to check this condition because if age is less than 18. It will give alert.(Next conditions..)
//    if (dobDate > today) {
//        alert("Birth date cannot be a future date");
//        return false;
//    }

    let age = today.getFullYear() - dobDate.getFullYear();
    const m = today.getMonth() - dobDate.getMonth();
    if (m < 0 || (m === 0 && today.getDate() < dobDate.getDate())) {
        age--;
    }

    if (age < 18) {
        alert("Student age must be 18 or above");
        return false;
    }

    // Admission date not greater than today
    if (admissionDate === "") {
        alert("Admission date is required");
        return false;
    }

    const admission = new Date(admissionDate);
    if (admission > today || admission < dobDate) {
        alert("Admission date cannot be greater than today or less than Birthdate");
        return false;
    }

    // City only characters
    if (!/^[a-zA-Z\s]+$/.test(city)) {
        alert("City must contain only characters");
        return false;
    }

    // StateCode max 2 & uppercase
    if (stateCode.length !== 2) {
        alert("State code must be exactly 2 characters");
        return false;
    }
    document.getElementById("stateCode").value = stateCode.toUpperCase();

    // Country only characters
    if (!/^[a-zA-Z\s]+$/.test(country)) {
        alert("Country must contain only characters");
        return false;
    }

//    window.onload = function () {
//        if (typeof emailErrorFromServer !== "undefined" && emailErrorFromServer !== "") {
//            alert(emailErrorFromServer);
//        }
//    };

    return true; // it will allow form submit
}
