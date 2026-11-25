

        async function getUniversities() {

    let country = document.getElementById("country").value.trim();

    let message = document.getElementById("message");

    let table = document.getElementById("resultTable");

    let data = document.getElementById("universityData");

    if (country === "") {
        message.innerHTML = "Please enter a country name.";
        table.style.display = "none";
        return;
    }

    message.innerHTML = "Fetching university data...";

    table.style.display = "none";
    data.innerHTML = "";

    try {

        let response = await fetch(
            "https://raw.githubusercontent.com/Hipo/university-domains-list/master/world_universities_and_domains.json"
        );

        if (!response.ok) {
            throw new Error("API request failed: " + response.status);
        }

        let universities = await response.json();

        let filtered = universities.filter(function(uni) {
            return uni.country.toLowerCase() === country.toLowerCase();
        });

        if (filtered.length === 0) {
            message.innerHTML = "No universities found for " + country;
            return;
        }

        filtered.forEach(function(uni) {

            let row = document.createElement("tr");

            let name = document.createElement("td");
            name.textContent = uni.name;

            let website = document.createElement("td");
            website.textContent = uni.domains.join(", ");

            let link = document.createElement("td");

            uni.web_pages.forEach(function(url) {

                let a = document.createElement("a");

                a.href = url;
                a.textContent = "Visit Website";
                a.target = "_blank";
                a.rel = "noopener noreferrer";

                link.appendChild(a);
                link.appendChild(document.createElement("br"));

            });

            row.appendChild(name);
            row.appendChild(website);
            row.appendChild(link);

            data.appendChild(row);

        });

        message.innerHTML = "Universities found: " + filtered.length;

        table.style.display = "table";

    }

    catch(error) {

        message.innerHTML = "Error: " + error.message;

        console.log(error);

    }

}
    