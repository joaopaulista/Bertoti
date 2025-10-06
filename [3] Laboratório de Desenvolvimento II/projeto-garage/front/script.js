const apiUrl = "http://localhost:8080/api/cars";

document.addEventListener("DOMContentLoaded", () => {
    fetchCars();

    document.getElementById("car-form").addEventListener("submit", async (e) => {
        e.preventDefault();
        const id = document.getElementById("car-id").value;
        const car = {
            brand: document.getElementById("brand").value,
            model: document.getElementById("model").value,
            year: parseInt(document.getElementById("year").value),
            type: document.getElementById("type").value
        };

        if (id) {
            await fetch(`${apiUrl}/${id}`, {
                method: "PUT",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(car)
            });
        } else {
            await fetch(apiUrl, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(car)
            });
        }

        clearForm();
        fetchCars();
    });
});

async function fetchCars() {
    const response = await fetch(apiUrl);
    const cars = await response.json();
    const tbody = document.getElementById("car-table-body");
    tbody.innerHTML = "";

    cars.forEach(car => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td>${car.year}</td>
            <td>${car.type}</td>
            <td>
                <button onclick="editCar(${car.id}, '${car.brand}', '${car.model}', ${car.year}, '${car.type}')">Editar</button>
                <button onclick="deleteCar(${car.id})">Excluir</button>
            </td>
        `;
        tbody.appendChild(row);
    });
}

function editCar(id, brand, model, year, type) {
    document.getElementById("car-id").value = id;
    document.getElementById("brand").value = brand;
    document.getElementById("model").value = model;
    document.getElementById("year").value = year;
    document.getElementById("type").value = type;
}

async function deleteCar(id) {
    if (confirm("Tem certeza que deseja excluir este carro?")) {
        await fetch(`${apiUrl}/${id}`, { method: "DELETE" });
        fetchCars();
    }
}

function clearForm() {
    document.getElementById("car-id").value = "";
    document.getElementById("car-form").reset();
}
