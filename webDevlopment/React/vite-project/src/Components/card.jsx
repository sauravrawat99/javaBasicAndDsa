function Card({ title, description, image }) {
  return (
    <div className="max-w-sm bg-white rounded-2xl shadow-lg p-5 hover:shadow-2xl transition duration-300">
      <img 
        src={image} 
        alt={title} 
        className="w-24 mx-auto mb-4"
      />
      
      <h2 className="text-xl font-bold text-center">{title}</h2>
      
      <p className="text-gray-600 text-center mt-2">
        {description}
      </p>
    </div>
  );
}

export default Card;