package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {
	
	private ArrayList<Post> posts;
	

	public NewsFeed() {
		this.posts = new ArrayList<>();
	}


	
	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}


	@Override
	public String toString() {
		return "NewsFeed [posts=" + posts + "]";
	}
	
	
	
	
	public void addPost(Post posts) {
		if(!this.posts.contains(posts)) {
			this.posts.add(posts);
		}
	}
	
	public void removePost(Post posts) {
		if(this.posts.contains(posts)) {
			this.posts.remove(posts);
		}
	}
	
	
	public void searchAllPosts(String username) {
		for(Post p : this.posts) {
			if(p.getUsername().equals(username)) {
				System.out.println(p);
			}
			
		}
	}
	
	
	public void searchMessage(String username) {
		for(Post p : this.posts) {
			if(p.getUsername().equals(username) && p instanceof MessageSubmission) {
				System.out.println(p);
			}
			
		}
	}
	
	public void searchPhotoMessage(String username) {
		for(Post p : this.posts) {
			if(p.getUsername().equals(username) && p instanceof PhotoSubmission) {
				System.out.println(p);
			}
			
		}
	}
	
	public void outputOfAllPosts() {
		for(Post p : this.posts) {
			System.out.println(p);
		}
	}
	
	
	
	
	

}
