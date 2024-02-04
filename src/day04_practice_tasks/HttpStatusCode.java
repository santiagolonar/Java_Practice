package day04_practice_tasks;

public class HttpStatusCode {

    public static void main(String[] args) {

    int statusCode = 300;
    String message = " ";

    switch (statusCode){
        case 200 -> message = "OK";
        case 201 -> message = "Created";
        case 202 -> message = "Accepted";
        case 301 -> message = "Moved permanently";
        case 303 -> message = "See other";
        case 304 -> message = "Not modified";
        case 307 -> message = "Temporary redirect";
        case 400 -> message = "Bad request";
        case 401 -> message = "Unauthorized";
        case 403 -> message = "Forbidden";
        case 404 -> message = "Not found";
        case 410 -> message = "Gone";
        case 500 -> message = "Internal Server error";
        case 503 -> message = "Service unavailable";
        default -> message = " status Code not found";
    }
        System.out.println(message);

    }
}
