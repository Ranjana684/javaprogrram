public class ChatbotFactory {
    public static Chatbot getChatbot(String queryType) {
        if (queryType.equalsIgnoreCase("billing")) {
            return new BillingChatbot();
        } else if (queryType.equalsIgnoreCase("technical")) {
            return new TechSupportChatbot();
        } else if (queryType.equalsIgnoreCase("general")) {
            return new GeneralChatbot();
        }
        return null;
    }
}
