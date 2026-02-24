package RestAssuredPractice.Interview.DifferenceBetweenCookieAndSession;

public class CookieAndSession {
    /**
     * What is the difference between Cookie and Session?
     */

    /**
     * The main difference between a Cookie and a Session is where the data is stored. Cookies store data on the client-side (your browser),
     * while Sessions store data on the server-side (the web server).
     *
     * Because HTTP is "stateless" (it forgets who you are after every request),
     * both cookies and sessions are used to "remember" you as you navigate a website.
     */


    /**
     * If an interviewer asks, "What is the relationship between them?"
     *
     * You can answer:
     *
     * "They work in a handshake. The Session lives on the server and holds the actual data to keep it secure.
     * The Cookie lives on the browser and holds only the Session ID.
     * The browser uses the cookie to present that ID to the server so the server can find the correct session
     */

    /**
     * The 3-Step Explanation
     * 1. Creation (Server-Side) "When I log in, the server creates a Session in its memory to store my details (like my cart or profile).
     * It generates a unique Session ID for that session."
     *
     * 2. Transport (The Cookie) "The server sends this Session ID back to my browser inside a Cookie.
     * The cookie is just a small file acting as a container for that ID."
     *
     * 3. Retrieval (The Handshake) "For every future request, my browser sends the Cookie (with the ID) back to the server.
     * The server reads the ID, looks up the specific Session in its memory, and knows who I am."
     */


    /**
     * The "Valet Parking" Analogy (Interview Answer)
     * "I like to think of the difference between a Session and a Cookie like Valet Parking."
     *
     * 1. The Setup (The Session) "When I arrive at the parking lot, I hand my car keys and my car (which represents my User Data) to the Valet.
     * The Valet takes my car and parks it securely in the lot.
     * This secure storage of my car by the Valet is the Session. It lives on the server side."
     *
     * 2. The Handshake (The Cookie) "Once the Valet has my car, he hands me a small paper ticket with a unique number on it, like #105.
     * This paper ticket is the Cookie.
     * It doesn't contain the car itself; it just holds the unique number (Session ID) that proves the car belongs to me."
     *
     * 3. The Retrieval (How they work together) "When I want my car back, I don't need to describe the car.
     * I just hand the Ticket (Cookie) back to the Valet. The Valet reads the number, goes to the spot matching that number,
     * and retrieves my Car (Session Data)."
     */
}
